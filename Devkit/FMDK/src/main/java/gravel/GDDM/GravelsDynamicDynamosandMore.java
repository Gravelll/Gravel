package gravel.GDDM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("gravelsdynamicdynamosandmore")
public class GravelsDynamicDynamosandMore
{
	public static GravelsDynamicDynamosandMore instance;
	public static final String modid = "gravelsdynamicdynamosandmore";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public GravelsDynamicDynamosandMore() 
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegiestries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		logger.info("setup method registered");
	}
	private void clientRegiestries(final FMLClientSetupEvent event)
	{
		logger.info("client method registered");
	}
}

