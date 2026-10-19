package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FlipkartPage;

public class CameraLensTest extends BaseTest {

    @Test
    public void verifyCameraLensImages() {

        FlipkartPage flipkart = new FlipkartPage(driver);


        flipkart.closeLoginPopup();
        flipkart.closeLoginPopupmainPage();
        // 1. Click Electronics
        flipkart.clickElectronics();

        // 2. Click Camera jnfknjfkn
        flipkart.clickCamera();

        // 3. Click Camera Lens
        flipkart.clickCameraLens();

        // 4. Count images
        int imageCount = flipkart.getCameraLensImageCount();

        System.out.println("Total Camera Lens images: " + imageCount);

        Assert.assertTrue(imageCount > 0,
                "No images found on Camera Lens page");
    }
}
