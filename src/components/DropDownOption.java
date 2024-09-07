package components;

import webx.A;
import webx.Details;
import webx.Li;
import webx.P;
import webx.Summary;
import webx.Ul;
import webx.WebXContainerElement;

/**
 *
 * @author ERC
 */
public class DropDownOption extends WebXContainerElement {

	private String title;
	private String[] nodes;

	public DropDownOption(String title, String... nodes) {
		this.title = title;
		this.nodes = nodes;
	}

	@Override
	public String render() {

		var ul = new Ul()
			.className("mt-2 space-y-1 px-4");

		for (String node : nodes) {
			ul
				.addChild(
					new Li()
						.addChild(
							new A(node)
								.hxPost(String.format("/%s", node.toLowerCase()))
                .hxTarget("#page")
								.className("block rounded-lg px-4 py-2 text-sm font-medium text-gray-500 hover:bg-gray-100 hover:text-gray-700")
						)
				);
		}

		return new Li().addChild(
			new Details()
			.className("group [&_summary::-webkit-details-marker]:hidden")
			.addChildren(
				new Summary()
					.className("flex cursor-pointer items-center justify-between rounded-lg px-4 py-2 text-gray-500 hover:bg-gray-100 hover:text-gray-700")
					.addChildren(
						new P(this.title)
							.className("text-sm font-medium"),
						new DropdownIcon()
					),
				ul
			)
		).render();
	}
}
