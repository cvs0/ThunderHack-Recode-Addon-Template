# ThunderHack Recode Addon Template

Welcome to the ThunderHack Recode Addon Template! This template serves as a starting point for developers looking to create addons for the ThunderHack Minecraft mod. ThunderHack enhances Minecraft gameplay with a variety of modules and features, and by developing addons, you can extend its capabilities even further.

## Getting Started

To begin developing your addon, follow these steps:

1. **Clone this repository**: Use `git clone` to download this template to your local environment.
2. **Customize the Template**: Rename the package and modify the provided example classes to fit your addon's needs. 
3. **Build Your Addon**: Compile your addon using Gradle. The build script is pre-configured for your convenience.
4. **Test Your Addon**: Place the compiled `.jar` file into the `mods` folder of your Minecraft installation and launch the game to test your addon with ThunderHack.

## Template Structure

This template includes essential components to kickstart your addon development:

- `src/client/java/com/example/ExampleMod.java`: Defines the main class that your addon should use.
- `src/client/resources/fabric.mod.json`: Contains mod metadata. Update this file with your addon's details, such as name, version, and description.

## Developing Your Addon

Consider the following guidelines while developing your addon:

- **Modules**: Define new modules in the `getModules` method of your main class.
- **Commands**: Implement custom commands in the `getCommands` method.
- **Initialization**: Use the `onInitialize` method for setup tasks when your addon is loaded.
- **Metadata**: Provide your addon's metadata by implementing the `getName`, `getAuthor`, `getPackage`, and `getRepo` methods.

## Contribution

Contributions to ThunderHack and its ecosystem are welcome. If you have improvements or fixes for the addon template, feel free to submit a pull request.

## License

This template is provided under the MIT License. See the `LICENSE` file for more details.

## Acknowledgments

- Thanks to the ThunderHack team and the Minecraft modding community for their support and contributions.

Happy Modding!
