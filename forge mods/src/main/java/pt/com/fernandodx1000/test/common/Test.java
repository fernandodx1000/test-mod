package pt.com.fernandodx1000.test.common;

import pt.com.fernandodx1000.test.Item.coopperIngot;
import pt.com.fernandodx1000.test.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "test", name = "testmod", version = "1.0")
public class Test {
	@SidedProxy(clientSide = "pt.com.fernandodx1000.test.common.ClientProxy", serverSide = "pt.com.fernandodx1000.test.common.CommonProxy")
	public static CommonProxy proxy;

	// Blocks
	public static Block copperOre = new copperOre(300, Material.rock)
			.setBlockName("copperOre").setBlockTextureName("test:copperore");

	// Items
	public static Item copperIngot = new coopperIngot(4000).setUnlocalizedName("copperIngot").setTextureName("test:copperingot");
	
	public Test() {

		registration();
		addRecipes();

		//ore Dictionary
		OreDictionary.registerOre("oreCopper", copperOre);
		OreDictionary.registerOre("ingotCopper", copperIngot);
	}

	public static void registration() {
		
		GameRegistry.registerBlock(copperOre, "copperOre");
		
		GameRegistry.registerItem(copperIngot, "copperIngot");
		
	}

	public static void addRecipes() {
		
		//crafting
		
		//smelting
		GameRegistry.addSmelting(Test.copperOre, new ItemStack(Test.copperIngot), 0.2f);
		
	}
}
