package gravel.GDDM.datagen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraft.data.DataGenerator;

public class BlockStateGen extends BlockStateProvider
{
    private static final Logger LOGGER = LogManager.getLogger();
	private static String modid = "gravelsdynamicdynamosandmore";

    public BlockStateGen(DataGenerator generator, ExistingFileHelper exFileHelper)
    {
        super(generator, modid, exFileHelper);
    }

	@Override
	protected void registerStatesAndModels() {
		// TODO Auto-generated method stub
		
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}