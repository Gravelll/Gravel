package gravel.GDDM.datagen;

import java.util.function.Consumer;

import gravel.GDDM.lists.BlockList;
import gravel.GDDM.lists.ItemList;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;

public class RecipeGen extends RecipeProvider {

    public RecipeGen(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(BlockList.copper_block)
                .patternLine("xxx")
                .patternLine("xxx")
                .patternLine("xxx")
                .key('x', ItemList.copper_ingot)
                .setGroup("GDDM")
                .addCriterion("Copper Ingot", InventoryChangeTrigger.Instance.forItems(ItemList.copper_ingot))
                .build(consumer);
    }
}
