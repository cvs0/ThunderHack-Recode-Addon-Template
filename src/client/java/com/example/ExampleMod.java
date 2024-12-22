package com.example;

import com.example.commands.ExampleCommand;
import com.example.hud.ExampleHudElement;
import com.example.modules.ExampleModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thunder.hack.api.IAddon;
import thunder.hack.features.cmd.Command;
import thunder.hack.features.hud.HudElement;
import thunder.hack.features.modules.Module;

import java.util.Arrays;
import java.util.List;

public class ExampleMod implements IAddon {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}

	@Override
	public List<Module> getModules() {
		return List.of(new ExampleModule());
	}

	@Override
	public List<Command> getCommands() {
		return List.of(new ExampleCommand());
	}

	@Override
	public List<HudElement> getHudElements() {
		return List.of(new ExampleHudElement());
	}

	@Override
	public String getPackage() {
		return "com.example";
	}

	@Override
	public String getName() {
		return "ExampleMod";
	}

	@Override
	public String getAuthor() {
		return "cvs0";
	}

	@Override
	public String getRepo() {
		return "https://github.com/cvs0/ThunderHack-Recode-Addon-Template";
	}

	@Override
	public String getVersion() {
		return "1.0.0";
	}
}