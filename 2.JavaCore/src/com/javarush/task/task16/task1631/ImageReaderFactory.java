package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        try {
            if (imageTypes.equals(ImageTypes.BMP)) {
                return new BmpReader();
            } else if (imageTypes.equals(ImageTypes.JPG)) {
                return new JpgReader();
            } else if (imageTypes.equals(ImageTypes.PNG)) {
                return new PngReader();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

        return null;
    }
}
