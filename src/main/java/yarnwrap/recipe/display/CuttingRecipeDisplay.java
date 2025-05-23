package yarnwrap.recipe.display;
public class CuttingRecipeDisplay { public net.minecraft.recipe.display.CuttingRecipeDisplay wrapperContained; public CuttingRecipeDisplay(net.minecraft.recipe.display.CuttingRecipeDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec codec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.codec()); }
public static yarnwrap.network.codec.PacketCodec codec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.display.CuttingRecipeDisplay.codec()); }
// public yarnwrap.recipe.display.CuttingRecipeDisplay method_64708(yarnwrap.recipe.display.SlotDisplay display) { return new yarnwrap.recipe.display.CuttingRecipeDisplay(wrapperContained.method_64708(display.wrapperContained)); }
// public static yarnwrap.recipe.display.CuttingRecipeDisplay method_64708(yarnwrap.recipe.display.SlotDisplay display, ) { return new yarnwrap.recipe.display.CuttingRecipeDisplay(net.minecraft.recipe.display.CuttingRecipeDisplay.method_64708(display.wrapperContained)); }

}