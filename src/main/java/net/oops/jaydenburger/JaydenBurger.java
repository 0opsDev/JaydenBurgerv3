package net.oops.jaydenburger;

import net.fabricmc.api.ModInitializer;

import net.oops.jaydenburger.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JaydenBurger implements ModInitializer {
	public static final String MOD_ID = "jaydenburger";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItem();
	}
}