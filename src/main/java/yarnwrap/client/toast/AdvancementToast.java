package yarnwrap.client.toast;
public class AdvancementToast { public net.minecraft.client.toast.AdvancementToast wrapperContained; public AdvancementToast(net.minecraft.client.toast.AdvancementToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry advancement() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.advancement); }
// public void advancement(yarnwrap.advancement.AdvancementEntry value) { wrapperContained.advancement = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementEntry advancement() { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.client.toast.AdvancementToast.advancement); }
// public static void advancement(yarnwrap.advancement.AdvancementEntry value, ) { net.minecraft.client.toast.AdvancementToast.advancement = value.wrapperContained; }

// public boolean soundPlayed() { return wrapperContained.soundPlayed; }
// public void soundPlayed(boolean value) { wrapperContained.soundPlayed = value; }
// public static boolean soundPlayed() { return net.minecraft.client.toast.AdvancementToast.soundPlayed; }
// public static void soundPlayed(boolean value, ) { net.minecraft.client.toast.AdvancementToast.soundPlayed = value; }

// public int DEFAULT_DURATION_MS() { return wrapperContained.DEFAULT_DURATION_MS; }
// public void DEFAULT_DURATION_MS(int value) { wrapperContained.DEFAULT_DURATION_MS = value; }
public static int DEFAULT_DURATION_MS() { return net.minecraft.client.toast.AdvancementToast.DEFAULT_DURATION_MS; }
// public static void DEFAULT_DURATION_MS(int value, ) { net.minecraft.client.toast.AdvancementToast.DEFAULT_DURATION_MS = value; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.toast.AdvancementToast.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.toast.AdvancementToast.TEXTURE = value.wrapperContained; }

public AdvancementToast(yarnwrap.advancement.AdvancementEntry advancement) { this.wrapperContained = new net.minecraft.client.toast.AdvancementToast(advancement.wrapperContained); }

}