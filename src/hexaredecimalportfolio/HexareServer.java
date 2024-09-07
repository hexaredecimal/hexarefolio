package hexaredecimalportfolio;

import blazing.BlazingResponse;
import blazing.Get;
import blazing.Post;
import blazing.Static;
import blazing.WebServer;
import components.SideNavigation;
import webx.A;
import webx.Button;
import webx.Div;
import webx.H1;
import webx.Hr;
import webx.Html;
import webx.Img;
import webx.Main;
import webx.P;
import webx.WebXElement;

/**
 *
 * @author ERC
 */
@WebServer
@Static("/vids")
@Static("/images")
public class HexareServer {

	@Get("/")
	public static void home(BlazingResponse response) {

		WebXElement page = new Html()
			.addHeaderScript("https://cdn.tailwindcss.com")
			.addChildren(
				new Div()
					.addChildren(
						new SideNavigation(),
						new Main()
							.id("page")
							.addChild(
								new Div()
									.addChildren(
										new H1("Overview")
											.className("p-5 text-center text-2xl border"),
										new Div()
											.className("place-self-end p-5 flex flex-row justify-center place-content-center")
											.addChildren(
												new Img()
													.src("https://hexaredecimal.github.io/img/profile.JPG")
													.attr("width", "40%")
													.className("px-5 border"),
												new Img("https://github-readme-stats.vercel.app/api/top-langs/?username=hexaredecimal&hide_border=true&theme=light")
													.attr("width", "40%")
													.className("px-5 border"),
												new Img("https://awesome-github-stats.azurewebsites.net/user-stats/hexaredecimal?cardType=level-alternate&preferLogin=false")
													.attr("width", "40%")
													.className("px-5 border"),
												new Img("https://github-readme-streak-stats.herokuapp.com?user=hexaredecimal")
													.attr("width", "40%")
													.className("px-5 border")
											),
										new Div()
											.className("p-5 flex flex-row justify-center")
											.addChildren(
												new Img("https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white"),
												new Img("https://img.shields.io/badge/%3C/%3E%20htmx-3D72D7?style=for-the-badge&logo=mysl&logoColor=white"),
												new Img("https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E"),
												new Img("https://img.shields.io/badge/Rust-black?style=for-the-badge&logo=rust&logoColor=#E57324"),
												new Img("https://img.shields.io/badge/astro-%232C2052.svg?style=for-the-badge&logo=astro&logoColor=white"),
												new Img("https://img.shields.io/badge/sqlite-%2307405e.svg?style=for-the-badge&logo=sqlite&logoColor=white"),
												new Img("https://img.shields.io/badge/NeoVim-%2357A143.svg?&style=for-the-badge&logo=neovim&logoColor=white"),
												new Img("https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white")
											),
										new Div()
											.className("p-5 flex flex-row justify-center")
											.addChildren(
												new Img("https://raw.githubusercontent.com/hexaredecimal/hexaredecimal/1cea772206a247dd061003d6595e5ce3ec3bdf0a/profile-3d-contrib/profile-gitblock.svg")
													.attr("width", "50%")
											)
									).className("overflow-y-auto")
							)
							.className("m-auto w-3/4 grow")
					).className("flex flex-row")
			);

		response.sendUiRespose(page);
	}

	@Post("/foreword")
	public static void foreword(BlazingResponse response) {
		String text = """
I'm a passionate developer with a strong foundation in programming, particularly in languages like Go, C, Java, Python, and Kotlin. 
My interests lie in low-level systems, including compiler design and operating system development. 
I thrive on tackling complex challenges, from code generation strategies to building unikernels.<br>
Currently, I'm working on a variety of projects, from creating my own OS environment to developing 
a programming language called SMLL. My work is a blend of creativity and technical prowess, 
whether I'm crafting a unique window manager or building a 3D UI application. <br>
I also have a keen interest in web development, where I'm pushing the boundaries with my BlazingWebX library.
In everything I do, I'm driven by a love for coding and a desire to innovate. My goal is to create cool, efficient, and powerful software that makes a difference.                 
""";
		var content = new Div()
			.addChildren(
				new H1("Foreword")
					.className("my-5 p-5 text-center text-2xl border"),
				new Div()
					.addChildren(
						new Div()
							.addChildren(
								new Img()
									.src("https://hexaredecimal.github.io/img/profile.JPG")
									.className("mx-5 size-12 rounded-full object-cover"),
								new P("Hi, I'm Hexaredecimal!")
									.className("text-3xl p-5")
							).className("flex flex-row"),
						new P(text)
							.className("text-lg p-5"),
						new Hr(),
						new Div()
							.addChildren(
								new Button("Visit my github")
									.className("border rounded-lg px-4 py-2 text-sm font-medium text-gray-500 hover:bg-gray-100 hover:text-gray-700")
							).className("p-5 flex flex-row justify-center")
					).className("mx-48")
			);

		response.sendUiRespose(content);
	}

	@Post("/hexarevision")
	public static void hexarevision(BlazingResponse response) {
		String text = """
At Hexarevision, we are dedicated to pushing the boundaries of software development and research. Our focus is on creating innovative developer tools that empower creators and advancing software
research in cutting-edge fields like AI. We're committed to delivering high-quality solutions that make a real impact.<br>
In addition to our dev tools and research, we're excited to be working on VR software that's designed to be both accessible 
and affordable. Our goal is to bring the future of VR to a wider audience without compromising on quality.<br>
At Hexarevision, we're not just building software; we're shaping the future of technology.               
""";
		var content = new Div()
			.addChildren(
				new Div()
					.className("flex flex-row justify-center p-5")
					.addChild(
						new Img()
							.src("/images/hexarevision.webp")
							.className("size-20 object-cover")
					),
				new Div()
					.addChildren(
						new P("HEXAREVISION")
							.className("text-3xl p-5"),
						new P(text)
							.className("text-xl p-5"),
						new Hr(),
						new Div()
							.addChildren(
								new A()
									.href("https://hexarevision.co.za/home")
									.addChild(
										new Button("Visit Hexarevision")
											.className("border rounded-lg px-4 py-2 text-sm font-medium text-gray-500 hover:bg-gray-100 hover:text-gray-700")
									)
							).className("p-5 flex flex-row justify-center")
					)
					.className("mx-48")
			);

		response.sendUiRespose(content);
	}

	@Post("/smll")
	public static void smll(BlazingResponse response) {
		String text = """
The SMLL Organization is dedicated to the ongoing development and enhancement of the SMLL programming language. 
Our mission is to create a robust ecosystem of tools, libraries, and resources that empower developers to build efficient and powerful software with SMLL.
We are passionate about pushing the language forward, ensuring that it remains a versatile and reliable choice for developers of all levels. 
Whether you're exploring low-level systems programming or developing modern web applications, the SMLL Organization is here to support your journey.
Join us as we continue to innovate and expand the possibilities of what can be achieved with SMLL.                
""";
		var content = new Div()
			.addChildren(
				new Div()
					.className("flex flex-row justify-center p-5")
					.addChild(
						new Img()
							.src("/images/larry.png")
							.className("size-20 object-cover")
					),
				new Div()
					.addChildren(
						new P("SMLL")
							.className("text-3xl p-5"),
						new P(text)
							.className("text-lg p-5"),
						new Hr(),
						new Div()
							.addChildren(
								new A()
									.href("https://hexarevision.co.za/home")
									.addChild(
										new Button("Visit Hexarevision")
											.className("border rounded-lg px-4 py-2 text-sm font-medium text-gray-500 hover:bg-gray-100 hover:text-gray-700")
									)
							).className("p-5 flex flex-row justify-center")
					)
					.className("mx-48")
			);

		response.sendUiRespose(content);
	}

	@Post("/hexarewm")
	public static void hexarewm(BlazingResponse response) {
		String text = """
Hexawm is my personal take on window management, built from the ground up to provide a seamless, efficient, and highly customizable environment for power users. 
Inspired by the flexibility and minimalism of tiling window managers, Hexawm aims to deliver a user experience that's both streamlined and powerful, 
tailored to fit the unique workflows of developers and tech enthusiasts. Drawing on my experience with Linux development, Hexawm is designed to be lightweight and fast, 
focusing on getting out of your way while giving you full control over your desktop. With a deep understanding of the intricacies of window management, I've crafted Hexawm 
to be more than just a tool—it's an extension of the user's intent, enabling them to navigate their workspace with ease and precision. Whether you're looking to optimize 
your productivity or explore new ways of interacting with your desktop, Hexawm offers the flexibility and performance you need.
Welcome to a new way of managing your windows—welcome to Hexawm.       
  """;
		var content = new Div()
			.addChildren(
				new Div()
					.addChildren(
						new P("HEXAREWM - MY OWN WINDOW MANAGER")
							.className("text-3xl p-5"),
						new P(text)
							.className("text-lg"),
						new Hr(),
						new Div()
							.addChildren(
								new Img("/images/2Pane.png")
									.attr("width", "70%"),
								new Img("/images/3Pane.png")
									.attr("width", "70%"),
								new Img("/images/3Pane2.png")
									.attr("width", "70%")
							).className("p-5 flex flex-row justify-center"),
						new Div()
							.addChildren(
								new A()
									.href("https://github.com/hexaredecimal/HEXAREWM/tree/main")
									.addChild(
										new Button("View HEXAREWM")
											.className("border rounded-lg px-4 py-2 text-sm font-medium text-gray-500 hover:bg-gray-100 hover:text-gray-700")
									)
							).className("p-5 flex flex-row justify-center")
					)
					.className("mx-52")
			);

		response.sendUiRespose(content);
	}

}
