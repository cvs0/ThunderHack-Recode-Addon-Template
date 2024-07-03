package com.example;

import com.example.modules.ExampleModule;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thunder.hack.api.IAddon;
import thunder.hack.modules.Module;

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
		// Return a list of your modules here
		return Arrays.asList(new ExampleModule());
	}
}