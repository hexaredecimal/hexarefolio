package components;

import webx.A;
import webx.Div;
import webx.Img;
import webx.P;
import webx.Strong;
import webx.WebXContainerElement;

/**
 *
 * @author ERC
 */
public class UserInfo extends WebXContainerElement {

	@Override
	public String render() {
		return new Div()
			.className("absolute inset-x-0 bottom-0")
			.addChildren(
				new A()
					.href("https://github.com/hexaredecimal")
					.className("flex items-center gap-2 bg-white p-4 hover:bg-gray-50")
					.addChildren(
						new Img()
							.src("https://hexaredecimal.github.io/img/profile.JPG")
							.className("size-10 rounded-full object-cover"),
						new Div()
							.addChild(
								new P()
									.className("text-xs")
									.addChild(
										new Strong("Gama Sibusiso Vincent")
											.className("block font-medium")
									)
							)
					)
			).render();
	}
}
