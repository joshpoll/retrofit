import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Converter.Factory factory1 = null;
        try {
            retrofit2.Retrofit.Builder builder2 = builder0.addConverterFactory(factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        okhttp3.Call.Factory factory1 = null;
        try {
            retrofit2.Retrofit.Builder builder2 = builder0.callFactory(factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.concurrent.Executor executor1 = null;
        try {
            retrofit2.Retrofit.Builder builder2 = builder0.callbackExecutor(executor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        okhttp3.OkHttpClient okHttpClient1 = null;
        try {
            retrofit2.Retrofit.Builder builder2 = builder0.client(okHttpClient1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Converter.Factory factory2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.addConverterFactory(factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        try {
            retrofit2.Retrofit.Builder builder2 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        okhttp3.Call.Factory factory2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.callFactory(factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.callFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.client(okHttpClient3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        try {
            retrofit2.Retrofit retrofit2 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.baseUrl(httpUrl3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass4 = factoryList3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit6 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callbackExecutor(executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Converter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.addConverterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.CallAdapter.Factory factory1 = null;
        try {
            retrofit2.Retrofit.Builder builder2 = builder0.addCallAdapterFactory(factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callbackExecutor(executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.addConverterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        okhttp3.HttpUrl httpUrl6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.baseUrl(httpUrl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder3.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder6 = builder3.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit6 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList1 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.baseUrl(httpUrl2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        okhttp3.Call.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder3.callFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder5.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder5.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit6 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit8 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        okhttp3.HttpUrl httpUrl6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.baseUrl(httpUrl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Converter.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.addConverterFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.callbackExecutor(executor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Converter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.addConverterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        try {
            retrofit2.Retrofit retrofit8 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.client(okHttpClient5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit4 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.concurrent.Executor executor5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder3.callbackExecutor(executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        try {
            retrofit2.Retrofit retrofit3 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl(httpUrl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl(httpUrl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        retrofit2.Converter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.addConverterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        okhttp3.Call.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.callFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        retrofit2.Converter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder5.addConverterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        okhttp3.Call.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        try {
            retrofit2.Retrofit retrofit4 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.concurrent.Executor executor7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder5.callbackExecutor(executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.addCallAdapterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        okhttp3.OkHttpClient okHttpClient11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder5.client(okHttpClient11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Converter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.addConverterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder5.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        retrofit2.Converter.Factory factory2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.addConverterFactory(factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        okhttp3.Call.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        retrofit2.Converter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.addConverterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder4.client(okHttpClient5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        try {
            retrofit2.Retrofit.Builder builder7 = builder4.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        okhttp3.Call.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder5.callFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder5.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.client(okHttpClient10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.baseUrl(httpUrl2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.baseUrl(httpUrl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = factoryList4.getClass();
        java.lang.Class<?> wildcardClass6 = factoryList4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.callFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder5.addCallAdapterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        java.lang.Class<?> wildcardClass7 = factoryList6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.concurrent.Executor executor9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.callbackExecutor(executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.concurrent.Executor executor5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callbackExecutor(executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        okhttp3.Call.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        okhttp3.Call.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        okhttp3.Call.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        okhttp3.HttpUrl httpUrl6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder4.baseUrl(httpUrl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.addCallAdapterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder6.callAdapterFactories();
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder6.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass10 = factoryList9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        try {
            retrofit2.Retrofit retrofit5 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        okhttp3.Call.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        try {
            retrofit2.Retrofit.Builder builder7 = builder4.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList11 = builder5.callAdapterFactories();
        retrofit2.Converter.Factory factory12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder5.addConverterFactory(factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.addCallAdapterFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder4.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = factoryList4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        java.lang.Class<?> wildcardClass8 = factoryList7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder0.converterFactories();
        retrofit2.Converter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.addConverterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.util.concurrent.Executor executor3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.callbackExecutor(executor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        retrofit2.Converter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.addConverterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        try {
            retrofit2.Retrofit retrofit6 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Converter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.addConverterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        try {
            retrofit2.Retrofit retrofit7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        okhttp3.Call.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.callFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        try {
            retrofit2.Retrofit retrofit6 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder4.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.CallAdapter.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.addCallAdapterFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callbackExecutor(executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder6.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit8 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        okhttp3.HttpUrl httpUrl3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.baseUrl(httpUrl3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder3.callAdapterFactories();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder3.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList11 = builder5.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder5.addCallAdapterFactory(factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        retrofit2.Converter.Factory factory3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.addConverterFactory(factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder3.callAdapterFactories();
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder3.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.callbackExecutor(executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.addCallAdapterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit4 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder3.client(okHttpClient5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.client(okHttpClient3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList11 = builder5.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder13 = builder5.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        java.util.concurrent.Executor executor9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.callbackExecutor(executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList11 = builder5.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder5.client(okHttpClient12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.CallAdapter.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.addCallAdapterFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = factoryList2.getClass();
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder4.addCallAdapterFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        okhttp3.Call.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit10 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder10 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.addCallAdapterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.addConverterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Retrofit.Builder builder2 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder2.addConverterFactory(factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder3.converterFactories();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder3.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder5.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(false);
        java.util.concurrent.Executor executor11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.callbackExecutor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addCallAdapterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit11 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder10 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.callbackExecutor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit10 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(false);
        java.util.concurrent.Executor executor11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder8.callbackExecutor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.concurrent.Executor executor2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.callbackExecutor(executor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.lang.Class<?> wildcardClass7 = builder5.getClass();
        retrofit2.CallAdapter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.addCallAdapterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Retrofit.Builder builder2 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder2.callFactory(factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.callFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder6 = builder3.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.client(okHttpClient10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.lang.Class<?> wildcardClass7 = builder5.getClass();
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.client(okHttpClient5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        okhttp3.HttpUrl httpUrl9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.baseUrl(httpUrl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder10 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.baseUrl(httpUrl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder10 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.addCallAdapterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        java.util.concurrent.Executor executor7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callbackExecutor(executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Converter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.addConverterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder9.validateEagerly(false);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        retrofit2.CallAdapter.Factory factory13 = null;
        try {
            retrofit2.Retrofit.Builder builder14 = builder9.addCallAdapterFactory(factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder7.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder7.getClass();
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder7.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        okhttp3.Call.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        retrofit2.Converter.Factory factory3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.addConverterFactory(factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder9.validateEagerly(false);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        try {
            retrofit2.Retrofit retrofit13 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder3.callAdapterFactories();
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder3.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = factoryList2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.util.concurrent.Executor executor3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.callbackExecutor(executor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder5.converterFactories();
        try {
            retrofit2.Retrofit retrofit8 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        okhttp3.HttpUrl httpUrl10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.baseUrl(httpUrl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder3.converterFactories();
        java.lang.Class<?> wildcardClass7 = builder3.getClass();
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder3.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder8.converterFactories();
        retrofit2.CallAdapter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder8.addCallAdapterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        okhttp3.HttpUrl httpUrl11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder9.baseUrl(httpUrl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        okhttp3.HttpUrl httpUrl1 = null;
        try {
            retrofit2.Retrofit.Builder builder2 = builder0.baseUrl(httpUrl1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder0.converterFactories();
        retrofit2.Converter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.addConverterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder9.validateEagerly(true);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        retrofit2.CallAdapter.Factory factory13 = null;
        try {
            retrofit2.Retrofit.Builder builder14 = builder11.addCallAdapterFactory(factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.callFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder0.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.addCallAdapterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Retrofit.Builder builder2 = builder0.validateEagerly(false);
        okhttp3.HttpUrl httpUrl3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder2.baseUrl(httpUrl3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder6.converterFactories();
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder6.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.concurrent.Executor executor9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.callbackExecutor(executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.baseUrl(httpUrl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.addCallAdapterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Retrofit.Builder builder2 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit3 = builder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder6.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder6.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder6.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        java.util.concurrent.Executor executor5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callbackExecutor(executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        java.util.concurrent.Executor executor7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callbackExecutor(executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callbackExecutor(executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder9.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder9.client(okHttpClient12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        retrofit2.CallAdapter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.addCallAdapterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder13 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder15 = builder13.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Converter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.addConverterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder11.callbackExecutor(executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        okhttp3.Call.Factory factory3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.callFactory(factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder13 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient14 = null;
        try {
            retrofit2.Retrofit.Builder builder15 = builder0.client(okHttpClient14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder0.callbackExecutor(executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.callbackExecutor(executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder13 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.addConverterFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit8 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.baseUrl(httpUrl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder9.validateEagerly(true);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        java.lang.Class<?> wildcardClass13 = builder11.getClass();
        okhttp3.HttpUrl httpUrl14 = null;
        try {
            retrofit2.Retrofit.Builder builder15 = builder11.baseUrl(httpUrl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList1 = builder0.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.addCallAdapterFactory(factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.addConverterFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder3.converterFactories();
        java.lang.Class<?> wildcardClass7 = builder3.getClass();
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder3.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.addCallAdapterFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        try {
            retrofit2.Retrofit retrofit3 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.addConverterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.client(okHttpClient11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder4.converterFactories();
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder4.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl(httpUrl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit9 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder6.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder6.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit9 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass4 = factoryList3.getClass();
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.addCallAdapterFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder0.converterFactories();
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder9.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList12 = builder9.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient13 = null;
        try {
            retrofit2.Retrofit.Builder builder14 = builder9.client(okHttpClient13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(factoryList12);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList12 = builder5.callAdapterFactories();
        okhttp3.HttpUrl httpUrl13 = null;
        try {
            retrofit2.Retrofit.Builder builder14 = builder5.baseUrl(httpUrl13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(factoryList12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass6 = factoryList5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder13 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder15 = builder13.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass4 = factoryList3.getClass();
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder5.addCallAdapterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit7 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        try {
            retrofit2.Retrofit retrofit11 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder13 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList14 = builder0.callAdapterFactories();
        retrofit2.Converter.Factory factory15 = null;
        try {
            retrofit2.Retrofit.Builder builder16 = builder0.addConverterFactory(factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(factoryList14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder7.converterFactories();
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder7.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        retrofit2.CallAdapter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder9.addCallAdapterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        retrofit2.Converter.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.addConverterFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder5 = builder3.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder3.addCallAdapterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.callFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder10 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.callFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.client(okHttpClient2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder8.addCallAdapterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient2 = null;
        try {
            retrofit2.Retrofit.Builder builder3 = builder0.client(okHttpClient2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
        okhttp3.Call.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.callFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.client(okHttpClient10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder3.converterFactories();
        java.lang.Class<?> wildcardClass7 = builder3.getClass();
        try {
            retrofit2.Retrofit.Builder builder9 = builder3.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder0.addCallAdapterFactory(factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Retrofit.Builder builder2 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder2.client(okHttpClient3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder8.converterFactories();
        okhttp3.OkHttpClient okHttpClient10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder8.client(okHttpClient10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder4.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder9.converterFactories();
        retrofit2.Retrofit.Builder builder13 = builder9.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient14 = null;
        try {
            retrofit2.Retrofit.Builder builder15 = builder13.client(okHttpClient14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit8 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder11.client(okHttpClient12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(false);
        okhttp3.HttpUrl httpUrl11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder8.baseUrl(httpUrl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        okhttp3.Call.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder0.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.addCallAdapterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder3.converterFactories();
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder3.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList11 = builder9.callAdapterFactories();
        java.util.concurrent.Executor executor12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder9.callbackExecutor(executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder6.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder6.callAdapterFactories();
        okhttp3.HttpUrl httpUrl9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder6.baseUrl(httpUrl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(false);
        retrofit2.Retrofit.Builder builder12 = builder10.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit13 = builder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder3.callFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder6.converterFactories();
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder6.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        okhttp3.HttpUrl httpUrl5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.baseUrl(httpUrl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder11.addCallAdapterFactory(factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder9.converterFactories();
        retrofit2.Retrofit.Builder builder13 = builder9.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder15 = builder9.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass4 = builder3.getClass();
        retrofit2.Retrofit.Builder builder6 = builder3.validateEagerly(true);
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder3.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Retrofit.Builder builder2 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory3 = null;
        try {
            retrofit2.Retrofit.Builder builder4 = builder0.addConverterFactory(factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.client(okHttpClient10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit9 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        try {
            retrofit2.Retrofit.Builder builder10 = builder7.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder4.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder4.callAdapterFactories();
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder4.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.client(okHttpClient11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder9.converterFactories();
        retrofit2.Retrofit.Builder builder13 = builder9.validateEagerly(false);
        retrofit2.Converter.Factory factory14 = null;
        try {
            retrofit2.Retrofit.Builder builder15 = builder13.addConverterFactory(factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit7 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        try {
            retrofit2.Retrofit retrofit10 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder6.converterFactories();
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder6.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        okhttp3.Call.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.callFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder9.converterFactories();
        okhttp3.OkHttpClient okHttpClient12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder9.client(okHttpClient12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        okhttp3.Call.Factory factory4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callFactory(factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder11.client(okHttpClient12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl(httpUrl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder6.callAdapterFactories();
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder6.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder8.converterFactories();
        okhttp3.HttpUrl httpUrl10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder8.baseUrl(httpUrl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder9.converterFactories();
        retrofit2.Retrofit.Builder builder13 = builder9.validateEagerly(false);
        retrofit2.Retrofit.Builder builder15 = builder9.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList16 = builder9.callAdapterFactories();
        java.lang.Class<?> wildcardClass17 = factoryList16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(factoryList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder0.callAdapterFactories();
        retrofit2.Converter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.addConverterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        okhttp3.Call.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.callFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder9.validateEagerly(true);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        retrofit2.Converter.Factory factory13 = null;
        try {
            retrofit2.Retrofit.Builder builder14 = builder11.addConverterFactory(factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder0.baseUrl(httpUrl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder9.callAdapterFactories();
        java.lang.Class<?> wildcardClass11 = factoryList10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.client(okHttpClient7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder9.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList12 = builder9.callAdapterFactories();
        okhttp3.Call.Factory factory13 = null;
        try {
            retrofit2.Retrofit.Builder builder14 = builder9.callFactory(factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(factoryList12);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.CallAdapter.Factory factory12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder11.addCallAdapterFactory(factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder10 = builder0.validateEagerly(true);
        java.util.concurrent.Executor executor11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.callbackExecutor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder3.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder3.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.client(okHttpClient9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = factoryList5.getClass();
        java.lang.Class<?> wildcardClass7 = factoryList5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit11 = builder10.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder5.converterFactories();
        okhttp3.OkHttpClient okHttpClient12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder5.client(okHttpClient12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder9.addCallAdapterFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass4 = builder3.getClass();
        retrofit2.Retrofit.Builder builder6 = builder3.validateEagerly(true);
        java.util.concurrent.Executor executor7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder3.callbackExecutor(executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder8.converterFactories();
        java.lang.Class<?> wildcardClass10 = builder8.getClass();
        try {
            retrofit2.Retrofit retrofit11 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(factoryList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList10 = builder9.callAdapterFactories();
        okhttp3.Call.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder9.callFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        okhttp3.Call.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.callFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = factoryList1.getClass();
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        okhttp3.Call.Factory factory12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder0.callFactory(factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        okhttp3.OkHttpClient okHttpClient4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.client(okHttpClient4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder0.converterFactories();
        retrofit2.CallAdapter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.addCallAdapterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder4.converterFactories();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder4.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        try {
            retrofit2.Retrofit retrofit3 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder13 = builder0.validateEagerly(false);
        java.util.concurrent.Executor executor14 = null;
        try {
            retrofit2.Retrofit.Builder builder15 = builder0.callbackExecutor(executor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        okhttp3.HttpUrl httpUrl10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.baseUrl(httpUrl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        okhttp3.Call.Factory factory10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder5.callFactory(factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList12 = builder5.callAdapterFactories();
        java.lang.Class<?> wildcardClass13 = factoryList12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(factoryList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder10 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        okhttp3.HttpUrl httpUrl12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder0.baseUrl(httpUrl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder5.callAdapterFactories();
        try {
            retrofit2.Retrofit retrofit9 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder5.callAdapterFactories();
        okhttp3.Call.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder5.callFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        okhttp3.Call.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder9.callFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.addConverterFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder13 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList14 = builder0.converterFactories();
        retrofit2.CallAdapter.Factory factory15 = null;
        try {
            retrofit2.Retrofit.Builder builder16 = builder0.addCallAdapterFactory(factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(factoryList14);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        try {
            retrofit2.Retrofit retrofit7 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass4 = builder3.getClass();
        retrofit2.Retrofit.Builder builder6 = builder3.validateEagerly(true);
        try {
            retrofit2.Retrofit retrofit7 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        okhttp3.OkHttpClient okHttpClient6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder5.client(okHttpClient6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(false);
        retrofit2.CallAdapter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder6.addCallAdapterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder3.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder3.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(true);
        java.util.concurrent.Executor executor11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder8.callbackExecutor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        okhttp3.HttpUrl httpUrl9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.baseUrl(httpUrl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList9 = builder5.converterFactories();
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder5.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder3.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder3.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder3.callAdapterFactories();
        retrofit2.Retrofit.Builder builder8 = builder3.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(true);
        retrofit2.Converter.Factory factory11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder10.addConverterFactory(factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder13 = builder11.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder0.converterFactories();
        try {
            retrofit2.Retrofit.Builder builder12 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.lang.Class<?> wildcardClass7 = builder5.getClass();
        try {
            retrofit2.Retrofit retrofit8 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.addConverterFactory(factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList6 = builder0.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass4 = builder3.getClass();
        retrofit2.CallAdapter.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder3.addCallAdapterFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        okhttp3.HttpUrl httpUrl8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.baseUrl(httpUrl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder5.converterFactories();
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder9 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder11 = builder9.validateEagerly(true);
        java.util.concurrent.Executor executor12 = null;
        try {
            retrofit2.Retrofit.Builder builder13 = builder9.callbackExecutor(executor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.callbackExecutor(executor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        try {
            retrofit2.Retrofit retrofit10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList7 = builder5.converterFactories();
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder5.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList9 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor10 = null;
        try {
            retrofit2.Retrofit.Builder builder11 = builder0.callbackExecutor(executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(factoryList9);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        retrofit2.Retrofit.Builder builder10 = builder8.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList11 = builder8.callAdapterFactories();
        try {
            retrofit2.Retrofit.Builder builder13 = builder8.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(factoryList11);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder8 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder8.callFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList8 = builder0.converterFactories();
        try {
            retrofit2.Retrofit retrofit9 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(factoryList8);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
        retrofit2.CallAdapter.Factory factory9 = null;
        try {
            retrofit2.Retrofit.Builder builder10 = builder0.addCallAdapterFactory(factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList8 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        retrofit2.Retrofit.Builder builder11 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder13 = builder0.validateEagerly(true);
        try {
            retrofit2.Retrofit.Builder builder15 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(factoryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        retrofit2.Retrofit.Builder builder2 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder4 = builder2.baseUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder7 = builder5.validateEagerly(false);
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        java.util.concurrent.Executor executor11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder9.callbackExecutor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        retrofit2.Converter.Factory factory6 = null;
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.addConverterFactory(factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList5 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        okhttp3.OkHttpClient okHttpClient8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.client(okHttpClient8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        java.util.concurrent.Executor executor8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.callbackExecutor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        okhttp3.Call.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder7.callFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList4 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder0.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addCallAdapterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(factoryList7);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList3 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.CallAdapter.Factory factory5 = null;
        try {
            retrofit2.Retrofit.Builder builder6 = builder0.addCallAdapterFactory(factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(factoryList4);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList11 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList12 = builder5.callAdapterFactories();
        retrofit2.Converter.Factory factory13 = null;
        try {
            retrofit2.Retrofit.Builder builder14 = builder5.addConverterFactory(factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
        org.junit.Assert.assertNotNull(factoryList11);
        org.junit.Assert.assertNotNull(factoryList12);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        try {
            retrofit2.Retrofit retrofit4 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Base URL required.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(true);
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(true);
        java.util.List<retrofit2.Converter.Factory> factoryList6 = builder5.converterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList7 = builder5.callAdapterFactories();
        retrofit2.Retrofit.Builder builder9 = builder5.validateEagerly(false);
        java.util.List<retrofit2.Converter.Factory> factoryList10 = builder5.converterFactories();
        java.util.concurrent.Executor executor11 = null;
        try {
            retrofit2.Retrofit.Builder builder12 = builder5.callbackExecutor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(factoryList6);
        org.junit.Assert.assertNotNull(factoryList7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(factoryList10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder6 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList2 = builder0.callAdapterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder5 = builder0.validateEagerly(false);
        try {
            retrofit2.Retrofit.Builder builder7 = builder0.baseUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal URL: ");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.util.List<retrofit2.Converter.Factory> factoryList1 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        java.util.List<retrofit2.Converter.Factory> factoryList3 = builder0.converterFactories();
        java.util.concurrent.Executor executor4 = null;
        try {
            retrofit2.Retrofit.Builder builder5 = builder0.callbackExecutor(executor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: executor == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(factoryList1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(factoryList3);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        retrofit2.Retrofit.Builder builder3 = builder0.validateEagerly(false);
        java.util.List<retrofit2.CallAdapter.Factory> factoryList4 = builder0.callAdapterFactories();
        java.util.List<retrofit2.CallAdapter.Factory> factoryList5 = builder0.callAdapterFactories();
        retrofit2.Retrofit.Builder builder7 = builder0.validateEagerly(false);
        retrofit2.Converter.Factory factory8 = null;
        try {
            retrofit2.Retrofit.Builder builder9 = builder0.addConverterFactory(factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(factoryList4);
        org.junit.Assert.assertNotNull(factoryList5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        retrofit2.Retrofit.Builder builder0 = new retrofit2.Retrofit.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        java.util.List<retrofit2.Converter.Factory> factoryList2 = builder0.converterFactories();
        retrofit2.Retrofit.Builder builder4 = builder0.validateEagerly(true);
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        okhttp3.HttpUrl httpUrl7 = null;
        try {
            retrofit2.Retrofit.Builder builder8 = builder0.baseUrl(httpUrl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: baseUrl == null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(factoryList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

