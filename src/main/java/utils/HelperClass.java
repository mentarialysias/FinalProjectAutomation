package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.jogamp.common.util.locks.Lock.TIMEOUT;

public class HelperClass {
    private static HelperClass helperClass;
    private static WebDriver driver; // Gunakan atribut kelas ini untuk menyimpan instance WebDriver

    private HelperClass() {
        // Mengatur path lokal dari driver Chrome
        System.setProperty("webdriver.chrome.driver", ".\\src\\driver\\chromedriver.exe");

        // Mengatur opsi Chrome (misalnya, start-maximized, remote-allow-origins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        // Menggunakan atribut kelas driver untuk inisialisasi WebDriver
        driver = new ChromeDriver(options);

        System.out.println("bebas");

        // Melakukan beberapa pengaturan pada driver seperti maximize window,
        // menghapus semua cookies, dan menetapkan waktu tunggu implisit
        driver.manage().window().maximize(); // Maksimalkan jendela
        driver.manage().deleteAllCookies(); // Hapus semua cookies
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT)); // Atur waktu tunggu implisit
    }

    // Metode untuk mendapatkan instance WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            setUpDriver();
        }
        return driver;
    }

    // Metode untuk pertama kali menjalankan WebDriver
    public static void setUpDriver() {
        if (helperClass == null) {
            helperClass = new HelperClass();
        }
    }

    // Metode untuk menutup WebDriver
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        helperClass = null;
    }

    // Metode untuk membuka URL pada WebDriver
    public static void openPage(String url) {
        getDriver().get(url);
    }

    public static String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }
}
