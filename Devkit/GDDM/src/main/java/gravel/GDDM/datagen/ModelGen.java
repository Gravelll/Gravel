package gravel.GDDM.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;

public class ModelGen extends ItemModelProvider
{
	private static String modid = "gravelsdynamicdynamosandmore";
	private static ExistingFileHelper exFileHelper;
	
	public ModelGen(DataGenerator gen,  ExistingFileHelper existingFileHelper)
    {
        super(gen, modid, exFileHelper);
    }


	@Override
    protected void registerModels()

	{
        getBuilder("tin_block")
                .parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", modLoc("gravelsdynamicdynamosandmore:block/tin_block"));

        getBuilder("tin_block")
                .parent(getExistingFile(mcLoc("block/block")))
                .texture("all", modLoc("gravelsdynamicdynamosandmore:block/tin_block"));
               
    }
	
	@Override
    public String getName()
    {
        return "GDDM Models";
    }
}


	