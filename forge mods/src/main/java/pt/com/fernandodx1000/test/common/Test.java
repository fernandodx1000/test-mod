package pt.com.fernandodx1000.test.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "test", name = "testmod", version = "1.0")
public class Test {
	@SidedProxy(clientSide = "pt.com.fernandodx1000.test.common.ClientProxy", serverSide = "pt.com.fernandodx1000.test.common.CommonProxy")
	public static CommonProxy proxy;

	//Blocks
	//public static Block testBlock = new testBlock(300, Material.rock).setBlockName("testblock");
	
	public Test() {
		
		
		
		
	}

}
