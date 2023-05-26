import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
public class ImageMixer extends JFrame {
    private BufferedImage sourceImage;
    private BufferedImage targetImage;
    private BufferedImage transferredImage;

    public ImageMixer() throws IOException {
        setTitle("Color Transfer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sourceImage = ImageIO.read(new File("C:\\Users\\vladb\\OneDrive\\Desktop\\True\\course-directory-beliaev-b-auca-2022\\bonus_project\\src\\image1.png"));
        targetImage = ImageIO.read(new File("C:\\Users\\vladb\\OneDrive\\Desktop\\True\\course-directory-beliaev-b-auca-2022\\bonus_project\\src\\image2.png"));
        transferredImage = transferColor(sourceImage, targetImage);
        JLabel sourceLabel = new JLabel(new ImageIcon(sourceImage));
        JLabel targetLabel = new JLabel(new ImageIcon(targetImage));
        JLabel transferredLabel = new JLabel(new ImageIcon(transferredImage));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        panel.add(sourceLabel);
        panel.add(targetLabel);
        panel.add(transferredLabel);
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static BufferedImage transferColor(BufferedImage sourceImage, BufferedImage targetImage) {
        int width = targetImage.getWidth();
        int height = targetImage.getHeight();
        double[][] sourceMean = computeMean(sourceImage);
        double[][] sourceVariance = computeVariance(sourceImage, sourceMean);
        double[][] targetMean = computeMean(targetImage);
        double[][] targetVariance = computeVariance(targetImage, targetMean);
        BufferedImage transferredImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color targetColor = new Color(targetImage.getRGB(x, y));
                double[] transformedColor = transformColor(targetColor, sourceMean, sourceVariance, targetMean, targetVariance);
                int red = (int) Math.round(transformedColor[0]);
                int green = (int) Math.round(transformedColor[1]);
                int blue = (int) Math.round(transformedColor[2]);
                int rgb = (red << 16) | (green << 8) | blue;
                transferredImage.setRGB(x, y, rgb);
            }
        }
        return transferredImage;
    }
    private static double[][] computeMean(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int pixelCount = width * height;
        double[][] mean = new double[3][1];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(image.getRGB(x, y));
                mean[0][0] += color.getRed();
                mean[1][0] += color.getGreen();
                mean[2][0] += color.getBlue();
            }
        }
        mean[0][0] /= pixelCount;
        mean[1][0] /= pixelCount;
        mean[2][0] /= pixelCount;
        return mean;
    }

    private static double[][] computeVariance(BufferedImage image, double[][] mean) {
        int width = image.getWidth();
        int height = image.getHeight();
        int pixelCount = width * height;
        double[][] variance = new double[3][1];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(image.getRGB(x, y));
                double redDiff = color.getRed() - mean[0][0];
                double greenDiff = color.getGreen() - mean[1][0];
                double blueDiff = color.getBlue() - mean[2][0];
                variance[0][0] += redDiff * redDiff;
                variance[1][0] += greenDiff * greenDiff;
                variance[2][0] += blueDiff * blueDiff;
            }
        }
        variance[0][0] /= pixelCount;
        variance[1][0] /= pixelCount;
        variance[2][0] /= pixelCount;
        return variance;
    }

    private static double[] transformColor(Color targetColor, double[][] sourceMean, double[][] sourceVariance, double[][] targetMean, double[][] targetVariance) {
        double[] transformedColor = new double[3];
        double red = targetColor.getRed();
        double green = targetColor.getGreen();
        double blue = targetColor.getBlue();
        transformedColor[0] = sourceMean[0][0] + (sourceVariance[0][0] / targetVariance[0][0]) * (red - sourceMean[0][0]);
        transformedColor[1] = sourceMean[1][0] + (sourceVariance[1][0] / targetVariance[1][0]) * (green - sourceMean[1][0]);
        transformedColor[2] = sourceMean[2][0] + (sourceVariance[2][0] / targetVariance[2][0]) * (blue - sourceMean[2][0]);
        transformedColor[0] = Math.max(0, Math.min(255, transformedColor[0]) );
        transformedColor[1] = Math.max(0, Math.min(255, transformedColor[1]) );
        transformedColor[2] = Math.max(0, Math.min(255, transformedColor[2]) );
        return transformedColor;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new ImageMixer();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
