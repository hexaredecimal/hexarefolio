package components;

import webx.Div;
import webx.P;
import webx.Span;
import webx.Ul;
import webx.WebXContainerElement;

/**
 *
 * @author ERC
 */
public class SideNavigation extends WebXContainerElement {

	@Override
	public String render() {
		return new Div()
			.className("fixed h-screen sticky top-0 border w-64")
			.addChildren(
				new Div()
					.className("px-4 py-6")
					.addChildren(
						new Span()
							.className("grid h-10 w-full place-content-center rounded-lg bg-gray-100 text-xs text-gray-600")
							.addChild(new P("HEXAREFOLIO")),
						new Ul()
							.className("mt-6 space-y-1")
							.addChildren(
								new Navitem("General", "/"),
								new Navitem("Foreword", null),
								new DropDownOption("Organisations", "Hexarevision", "SMLL"),
								new DropDownOption("Projects", "Hexarewm", "SMLL", "BlazingWebX", "Equcyph", "CollabMD")
								//new Navitem("General")
							)
					),
				new UserInfo()
			).render();
	}
}
