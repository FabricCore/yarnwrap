package yarnwrap.client.gui.screen.ingame;
public class BrewingStandScreen { public net.minecraft.client.gui.screen.ingame.BrewingStandScreen wrapperContained; public BrewingStandScreen(net.minecraft.client.gui.screen.ingame.BrewingStandScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BrewingStandScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BrewingStandScreen.TEXTURE = value.wrapperContained; }

// public int[] BUBBLE_PROGRESS() { return wrapperContained.BUBBLE_PROGRESS; }
// public void BUBBLE_PROGRESS(int[] value) { wrapperContained.BUBBLE_PROGRESS = value; }
// public static int[] BUBBLE_PROGRESS() { return net.minecraft.client.gui.screen.ingame.BrewingStandScreen.BUBBLE_PROGRESS; }
// public static void BUBBLE_PROGRESS(int[] value, ) { net.minecraft.client.gui.screen.ingame.BrewingStandScreen.BUBBLE_PROGRESS = value; }

// public yarnwrap.util.Identifier FUEL_LENGTH_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FUEL_LENGTH_TEXTURE); }
// public void FUEL_LENGTH_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FUEL_LENGTH_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier FUEL_LENGTH_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BrewingStandScreen.FUEL_LENGTH_TEXTURE); }
// public static void FUEL_LENGTH_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BrewingStandScreen.FUEL_LENGTH_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier BREW_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BREW_PROGRESS_TEXTURE); }
// public void BREW_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BREW_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier BREW_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BrewingStandScreen.BREW_PROGRESS_TEXTURE); }
// public static void BREW_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BrewingStandScreen.BREW_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier BUBBLES_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BUBBLES_TEXTURE); }
// public void BUBBLES_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BUBBLES_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier BUBBLES_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BrewingStandScreen.BUBBLES_TEXTURE); }
// public static void BUBBLES_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BrewingStandScreen.BUBBLES_TEXTURE = value.wrapperContained; }

public BrewingStandScreen(yarnwrap.screen.BrewingStandScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.BrewingStandScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}