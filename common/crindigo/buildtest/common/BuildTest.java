package crindigo.buildtest.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

@Mod(
        modid = "buildtest",
        name = "BuildTest",
        version = "0.0.1"
)
@NetworkMod(
        clientSideRequired = true,
        serverSideRequired = false
)
public class BuildTest
{
    @Mod.Init
    public void load(FMLInitializationEvent event)
    {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.brick, 4), Block.brick);
    }
}
