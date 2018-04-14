package retrofit2;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public final class UtilsTest {
  private class Foo {
    
  }

  private class Bar extends Foo {

  }

  @Test public void reflexiveTypeEquality() {
    assertThat(Utils.equals(int.class, int.class)).isEqualTo(true);
  }

  @Test public void classInEquality() {
    assertThat(Utils.equals(Foo.class, Bar.class)).isEqualTo(false);
  }
}
