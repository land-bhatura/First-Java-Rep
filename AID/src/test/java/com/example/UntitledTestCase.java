package com.example;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.apache.commons.io.FileUtils;
import java.io.File;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
	  ChromeDriverManager.getInstance().setup();
  
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.microsoft.com/en-in/");
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.google.com/search?q=microsoft+login&rlz=1C1CHBF_enIN1016IN1016&oq=microsoft+login&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDIHCAMQABiABDIHCAQQABiABDIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBCDY0NTdqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://account.microsoft.com/account/Account");
    driver.findElement(By.id("id__5")).click();
    driver.get("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?scope=service%3A%3Aaccount.microsoft.com%3A%3AMBI_SSL+openid+profile+offline_access&response_type=code&client_id=81feaced-5ddd-41e7-8bef-3e20a2689bb7&redirect_uri=https%3A%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin-oauth&client-request-id=df112d07-a66b-430e-84cb-3e10fc7485cc&x-client-SKU=MSAL.Desktop&x-client-Ver=4.61.1.0&x-client-OS=Windows+Server+2019+Datacenter&prompt=login&client_info=1&state=H4sIAAAAAAAEAAXBXbtCMAAA4P_SrYvjhMlFF81HUqaN-Th3KjFL9CCbX3_ed8OWxRpq60g4AImDLgCdy4EfkXsYI-FvgYJ4YscPKEjUnZYm3rXLAYDA92rUkNk3L_7rh-qJk4S9WYlm66IBktPrDfSHDLQrc1pEnlvXnrU0XlqCcQOwi9lbmbxXJupbvLaPW-FnrCcY4ONYpBCW2q6bp2Un5o_1DT9vXU4pf18pWOk5skSh4bk3GXdtB09oUMfq2qp2LxCPFOPiKZYz5DkbeZ36rIOqM6WfVUFF2He_JtarZiWOQaXXoVBCv9xJaA-pQRl71IWMQcaKW8t_nt9OP9UKMnJ5UO-yrWyNLuKeWTe7jCouQTCh16RQDbpXcP6jlyoIx0MfUtXNId7vN_8TQG_RWgEAAA&msaoauth2=true&lc=1033");
    driver.findElement(By.id("i0116")).clear();
    driver.findElement(By.id("i0116")).sendKeys("Siddhant.Agarwal@umusic.com");
    driver.findElement(By.id("idSIButton9")).click();
    driver.findElement(By.id("i0118")).click();
    driver.findElement(By.id("i0118")).clear();
    driver.findElement(By.id("i0118")).sendKeys("BHramand@123");
    driver.findElement(By.id("idSIButton9")).click();
    driver.get("https://login.microsoftonline.com/common/login");
    driver.findElement(By.id("i0118")).click();
    driver.findElement(By.id("i0118")).clear();
    driver.findElement(By.id("i0118")).sendKeys("Bhramand@123");
    driver.findElement(By.id("i0281")).submit();
    driver.get("https://login.microsoftonline.com/federation/redirecttoexternalprovider");
    driver.get("https://us.azureauth.duosecurity.com/authorization");
    driver.get("https://api-fc4cbf3a.duosecurity.com/frame/frameless/v4/auth?sid=frameless-9b0452a5-0949-4852-bf10-ce551eb62ddd&tx=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6Im9wZW5pZCB2ZXJpZnlfdGVuYW50IiwicmVkaXJlY3RfdXJpIjoiaHR0cHM6Ly91cy5henVyZWF1dGguZHVvc2VjdXJpdHkuY29tL3ZlcmlmeSIsImNsaWVudF9pZCI6IkRJNDJPVFJNWE9FOVFHQjhTNzVGIiwiaXNzIjoiREk0Mk9UUk1YT0U5UUdCOFM3NUYiLCJhdWQiOiJodHRwczovL2FwaS1mYzRjYmYzYS5kdW9zZWN1cml0eS5jb20iLCJleHAiOjE3MjA0NTEwMDUuMzE5NzIwMywic3RhdGUiOiI1NGIyMzgzODlhZWQ0NzFhZDlhYTVkNGJkZTRkYzk3NWIzZjBhNjUyMzZkMGEyZjVkZjZkNjc2MmY0ZDM1NmJmIiwibm9uY2UiOiJwNEk0bVNpcXloNVVBRmU2Y2k3dGM1d0czbW5UZm8xZlZuS3R0RlFrZ01PR1Q3S1hDd1J6bzhZaWJjd1JFRkJOIiwicmVzcG9uc2VfdHlwZSI6ImNvZGUiLCJkdW9fdW5hbWUiOiJTaWRkaGFudC5BZ2Fyd2FsQHVtdXNpYy5jb20iLCJ0ZW5hbnRfaWQiOiJiYmNiNmIyZi04YzdjLTRlMjQtODZlNC02YzM2ZmVkMDBiNzgiLCJ1c2VfZHVvX2NvZGVfYXR0cmlidXRlIjp0cnVlfQ.5T5t56ZfwMgJfWkJ7TZvXytIMJbvBTitkrPn0wpLFOZ22kYhJkDN7PbQ_oh0axyMpxDFlvjw8hDRVkogbOB8LQ&req-trace-group=3f5ae15703d4a63a49ce43b9");
    driver.get("https://api-fc4cbf3a.duosecurity.com/frame/v4/preauth/healthcheck?sid=frameless-9b0452a5-0949-4852-bf10-ce551eb62ddd");
    driver.get("https://api-fc4cbf3a.duosecurity.com/frame/frameless/v4/auth?sid=frameless-9b0452a5-0949-4852-bf10-ce551eb62ddd&tx=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6Im9wZW5pZCB2ZXJpZnlfdGVuYW50IiwicmVkaXJlY3RfdXJpIjoiaHR0cHM6Ly91cy5henVyZWF1dGguZHVvc2VjdXJpdHkuY29tL3ZlcmlmeSIsImNsaWVudF9pZCI6IkRJNDJPVFJNWE9FOVFHQjhTNzVGIiwiaXNzIjoiREk0Mk9UUk1YT0U5UUdCOFM3NUYiLCJhdWQiOiJodHRwczovL2FwaS1mYzRjYmYzYS5kdW9zZWN1cml0eS5jb20iLCJleHAiOjE3MjA0NTEwMDUuMzE5NzIwMywic3RhdGUiOiI1NGIyMzgzODlhZWQ0NzFhZDlhYTVkNGJkZTRkYzk3NWIzZjBhNjUyMzZkMGEyZjVkZjZkNjc2MmY0ZDM1NmJmIiwibm9uY2UiOiJwNEk0bVNpcXloNVVBRmU2Y2k3dGM1d0czbW5UZm8xZlZuS3R0RlFrZ01PR1Q3S1hDd1J6bzhZaWJjd1JFRkJOIiwicmVzcG9uc2VfdHlwZSI6ImNvZGUiLCJkdW9fdW5hbWUiOiJTaWRkaGFudC5BZ2Fyd2FsQHVtdXNpYy5jb20iLCJ0ZW5hbnRfaWQiOiJiYmNiNmIyZi04YzdjLTRlMjQtODZlNC02YzM2ZmVkMDBiNzgiLCJ1c2VfZHVvX2NvZGVfYXR0cmlidXRlIjp0cnVlfQ.5T5t56ZfwMgJfWkJ7TZvXytIMJbvBTitkrPn0wpLFOZ22kYhJkDN7PbQ_oh0axyMpxDFlvjw8hDRVkogbOB8LQ");
    driver.get("https://api-fc4cbf3a.duosecurity.com/frame/v4/auth/prompt?sid=frameless-9b0452a5-0949-4852-bf10-ce551eb62ddd");
    driver.get("https://us.azureauth.duosecurity.com/verify?state=54b238389aed471ad9aa5d4bde4dc975b3f0a65236d0a2f5df6d6762f4d356bf&duo_code=ZjpMFET8kqca3EYEmYUmTAxPETEjirw1");
    driver.get("https://myaccount.microsoft.com/?ref=amc&login_hint=Siddhant.Agarwal@umusic.com&tenantId=bbcb6b2f-8c7c-4e24-86e4-6c36fed00b78");
    driver.get("https://myaccount.microsoft.com/#code=0.AQ0AL2vLu3yMJE6G5Gw2_tALeNfqWYwD1ydKnlXJagBUyNINAIs.AgABBAIAAAApTwJmzXqdR4BN2miheQMYAgDs_wUA9P_R_pT0N0RPBeZWnOmmSD0yWgI7yVFmLtR6UcMBovacO5HhU7TLvB6Z1ytNMPnS_t5sgh6EYBez8T7Ytz71YbvRaJseMMzj-_oqjts03GKpi3EsxyqQodG1B2MzZjuk87sxKgd9LFyFs07L2S2qv0GilCSreWbsNXrQxYAz-D9DzdMV8RUKIT17iGovZcl-GZcFKBGF3BKWRAuspc2g0do45PBmMBbjNMQUIdKYO0MPMqHiQdtDSv9BnxBUZLw_eT_v1FFJmzWDzXn9HlO1KbKQHBBse3EwYzuMnOpGLEKwvdsqYi4qFvTza7caKViwFUbsnAxvg0m5TNWDmYd3SXPTKM_zNcffEov60w6n3i8DTXfkPjkOy0IemEP9FYwnPfE4WBDmtD02L4EtVGpk22BILbIcdIIWE3owII-YaAk1-EzokUzid6suBqeS8hSl2iCue7zb6j7OSurv_fWnHxGZyyY_KtL232Br-XKe9Y9hqymNgG9Ozy8f2bnBnoJLr9mqCrRhIJeCswb1uMUfmtupaadjZlT6NQZEYR4SovI80GgcK4U0uCftaPdCbz6G2Cd5HTVcozWUCN-YS8ZPH8VId73a1AiswwFkLP8LCtoAoakElwQDh8BjfAPM6Mro-CdManiYPS5W-S-uYgzIMfcDuVxj5eakOCtZjB3aAcAMjwuQovHc3zrV51Lhcgd-3MNn6vqM4EAmcjJDp22WHoEPt9B9Gov68947m7U82GwoNWgc-LLvukoSmtrjHGY-4Q6Rfg_fs-8BR0Kq4CcyAQtwR1vunUOF2bJoBoc8ugkUzZJygVftrIVo00ErFqX5OLuxq5deejHeddhveRMF8B8Lpt0&client_info=eyJ1aWQiOiI2Y2Q2NWEyOC00OTZmLTQ5OTUtODhlYy1lZjVhZTFiYzdlNDgiLCJ1dGlkIjoiYmJjYjZiMmYtOGM3Yy00ZTI0LTg2ZTQtNmMzNmZlZDAwYjc4In0&state=eyJpZCI6ImMxZTUwMTQ2LTRmYTctNGZiZS1iYjMzLWVkMDhjOTM0MmJkZiIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3d&session_state=a4293cdd-276c-4ab3-8057-9d9fd21a6118");
    driver.get("https://csc.service-now.com/sp?id=kb_article_view&sys_kb_id=0114a6d8db224b08d417e1994b9619cc&glide_sso_id=7b5e13254fb5d600a198a4eab110c723");
    driver.get("https://myaccount.microsoft.com/?ref=amc");
    driver.get("https://csc.service-now.com/auth_redirect.do?sysparm_stack=no&sysparm_url=https%3A%2F%2Fuid.dxc.com%2Fapp%2Fdxcprod_dxcservicenowbpcommercialproduction_1%2Fexk65avoeQar4K7vM5d6%2Fsso%2Fsaml%3FSAMLRequest%3DjVLBjpswEP0V5DsYKFkSK0SiiapG3d3STdpDLytjD7tWwaYew6Z%252FX0NS7fbQqCdbM8%252FvvXnjNfKuTXtWDu5ZP8DPAdAFp67VyM6dggxWM8NRIdO8A2ROsEN5d8vSKGa9Nc4I05KgRATrlNFbo3HowB7AjkrA14fbgjw71yOjVKCI8FwPtXmJhOmo5mPPnyCShgQ7r640n2heHw1KRvIkZjDve%252BrvXlY%252B%252BvPC5anq3re9qlC8nbqDmEgeEwqnHzcLPhr4wm32KR%252FvFvKGIho6jUeCD8YKmIcvSMNbBBLsdwU53G8Xq3i5ylOR5kn6Lgfe1HEim6zOebPM6iT3QKw4ohrh9SniAHuNjmtXkDROszDOw3h5TDK2WLEkjtI0%252BU6C6hLbe6Wl0k%252FXM67PIGQfj8cqrD4fjjPBqCTYe4%252F%252B%252F3i%252FgcU5Wk9LNut5wWz2bN%252Fu%252FLod%252FmfRZHNFd03fsl%252B0ejb53e8q0yrxKyjb1rxsLXDnZ3B2gHkdHXf%252FNpBEyVxRMmxmKIOOq7aU0gIioZuL7t8fevMb%26RelayState%3Dhttps%253A%252F%252Fcsc.service-now.com%252Fsp%253Fid%253Dkb_article_view%2526sys_kb_id%253D0114a6d8db224b08d417e1994b9619cc%2526glide_sso_id%253D7b5e13254fb5d600a198a4eab110c723");
    driver.get("https://myaccount.microsoft.com/?ref=amc");
    driver.get("https://uid.dxc.com/app/dxcprod_dxcservicenowbpcommercialproduction_1/exk65avoeQar4K7vM5d6/sso/saml?SAMLRequest=jVLBjpswEP0V5DsYKFkSK0SiiapG3d3STdpDLytjD7tWwaYew6Z%2FX0NS7fbQqCdbM8%2FvvXnjNfKuTXtWDu5ZP8DPAdAFp67VyM6dggxWM8NRIdO8A2ROsEN5d8vSKGa9Nc4I05KgRATrlNFbo3HowB7AjkrA14fbgjw71yOjVKCI8FwPtXmJhOmo5mPPnyCShgQ7r640n2heHw1KRvIkZjDve%2BrvXlY%2B%2BvPC5anq3re9qlC8nbqDmEgeEwqnHzcLPhr4wm32KR%2FvFvKGIho6jUeCD8YKmIcvSMNbBBLsdwU53G8Xq3i5ylOR5kn6Lgfe1HEim6zOebPM6iT3QKw4ohrh9SniAHuNjmtXkDROszDOw3h5TDK2WLEkjtI0%2BU6C6hLbe6Wl0k%2FXM67PIGQfj8cqrD4fjjPBqCTYe4%2F%2B%2F3i%2FgcU5Wk9LNut5wWz2bN%2Fu%2FLod%2FmfRZHNFd03fsl%2B0ejb53e8q0yrxKyjb1rxsLXDnZ3B2gHkdHXf%2FNpBEyVxRMmxmKIOOq7aU0gIioZuL7t8fevMb&RelayState=https%3A%2F%2Fcsc.service-now.com%2Fsp%3Fid%3Dkb_article_view%26sys_kb_id%3D0114a6d8db224b08d417e1994b9619cc%26glide_sso_id%3D7b5e13254fb5d600a198a4eab110c723");
    driver.get("https://myaccount.microsoft.com/?ref=amc");
    driver.get("https://uid.dxc.com/app/dxcprod_dxcservicenowbpcommercialproduction_1/exk65avoeQar4K7vM5d6/sso/saml?SAMLRequest=jVLBjpswEP0V5DsYKFkSK0SiiapG3d3STdpDLytjD7tWwaYew6Z%2FX0NS7fbQqCdbM8%2FvvXnjNfKuTXtWDu5ZP8DPAdAFp67VyM6dggxWM8NRIdO8A2ROsEN5d8vSKGa9Nc4I05KgRATrlNFbo3HowB7AjkrA14fbgjw71yOjVKCI8FwPtXmJhOmo5mPPnyCShgQ7r640n2heHw1KRvIkZjDve%2BrvXlY%2B%2BvPC5anq3re9qlC8nbqDmEgeEwqnHzcLPhr4wm32KR%2FvFvKGIho6jUeCD8YKmIcvSMNbBBLsdwU53G8Xq3i5ylOR5kn6Lgfe1HEim6zOebPM6iT3QKw4ohrh9SniAHuNjmtXkDROszDOw3h5TDK2WLEkjtI0%2BU6C6hLbe6Wl0k%2FXM67PIGQfj8cqrD4fjjPBqCTYe4%2F%2B%2F3i%2FgcU5Wk9LNut5wWz2bN%2Fu%2FLod%2FmfRZHNFd03fsl%2B0ejb53e8q0yrxKyjb1rxsLXDnZ3B2gHkdHXf%2FNpBEyVxRMmxmKIOOq7aU0gIioZuL7t8fevMb&RelayState=https%3A%2F%2Fcsc.service-now.com%2Fsp%3Fid%3Dkb_article_view%26sys_kb_id%3D0114a6d8db224b08d417e1994b9619cc%26glide_sso_id%3D7b5e13254fb5d600a198a4eab110c723");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.close();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
