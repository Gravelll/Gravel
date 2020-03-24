package gravel.GDDM;

//Imported types go here, check to make sure the type you want to use is here
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gravel.GDDM.lists.BlockList;
import gravel.GDDM.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("gravelsdynamicdynamosandmore")
public class GDDM_Core
{
	public static GDDM_Core instance;
	public static final String modid = "gravelsdynamicdynamosandmore";
	private static final Logger logger = LogManager.getLogger(modid);
	
	//Using the ItemGroup Id to make a new ItemGroup
	public static final ItemGroup GDDM = new GDDMItemGroup();
	
	public GDDM_Core() 
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

	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			//Items go here
			(
			ItemList.copper_ingot = new Item(new Item.Properties().group(GDDM)).setRegistryName(location("copper_ingot")),
			ItemList.flintsteel_ingot = new Item(new Item.Properties().group(GDDM)).setRegistryName(location("flintsteel_ingot")),
			ItemList.bronze_bar = new Item(new Item.Properties().group(GDDM)).setRegistryName(location("bronze_bar")),
			ItemList.damascus_ingot = new Item(new Item.Properties().group(GDDM)).setRegistryName(location("damascus_ingot")),
			ItemList.flintsteel_plate = new Item(new Item.Properties().group(GDDM)).setRegistryName(location("flintsteel_plate")),
			ItemList.gravel_plate = new Item(new Item.Properties().group(GDDM)).setRegistryName(location("gravel_plate")),
			ItemList.tin_ingot = new Item(new Item.Properties().group(GDDM)).setRegistryName(location("tin_ingot")),
			//BlockItem properties go here
			ItemList.bronze_block = new BlockItem(BlockList.bronze_block, new Item.Properties().group(GDDM)).setRegistryName(BlockList.bronze_block.getRegistryName()),
			ItemList.flintsteel_block = new BlockItem(BlockList.flintsteel_block, new Item.Properties().group(GDDM)).setRegistryName(BlockList.flintsteel_block.getRegistryName()),
			ItemList.damascus_block = new BlockItem(BlockList.damascus_block, new Item.Properties().group(GDDM)).setRegistryName(BlockList.damascus_block.getRegistryName()),
			ItemList.copper_block = new BlockItem(BlockList.copper_block, new Item.Properties().group(GDDM)).setRegistryName(BlockList.copper_block.getRegistryName()),
			ItemList.tin_block = new BlockItem(BlockList.tin_block, new Item.Properties().group(GDDM)).setRegistryName(BlockList.tin_block.getRegistryName())
			);
			logger.info("Items registered");
		}
			@SubscribeEvent
			public static void registerBlocks(RegistryEvent.Register<Block> event)
			{
				event.getRegistry().registerAll
				//Blocks go here
				(
						BlockList.bronze_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 45.0f).sound(SoundType.METAL)).setRegistryName(location("bronze_block")),
						BlockList.flintsteel_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 45.0f).sound(SoundType.METAL)).setRegistryName(location("flintsteel_block")),
						BlockList.copper_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 45.0f).sound(SoundType.METAL)).setRegistryName(location("copper_block")),
						BlockList.damascus_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 45.0f).sound(SoundType.METAL)).setRegistryName(location("damascus_block"))
				);
				logger.info("Blocks registered");
		}
		//Manages resources, do not touch...not like last time *shutters*
		private static ResourceLocation location(String name)
		{
			return new ResourceLocation(modid, name);
		}
		}
	}


