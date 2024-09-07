package components;

import webx.A;
import webx.Li;
import webx.WebXContainerElement;

/**
 *
 * @author ERC
 */
public class Navitem extends WebXContainerElement {

  private final String text, url;

  public Navitem(String text, String url) {
    this.text = text;
    this.url = url;
  }

  @Override
  public String render() {
    var btn = new A(this.text);

    if (url != null) {
      btn.href(this.url);
    } else {
      btn
        .hxPost(String.format("/%s", this.text.toLowerCase()))
        .hxTarget("#page");
    }

    btn.className("block rounded-lg px-4 py-2 text-sm font-medium text-gray-500 hover:bg-gray-100 hover:text-gray-700");
    return new Li()
            .addChild(btn)
            .render();
  }
}
