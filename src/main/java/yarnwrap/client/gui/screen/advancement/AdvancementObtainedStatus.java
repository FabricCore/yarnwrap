package yarnwrap.client.gui.screen.advancement;
public class AdvancementObtainedStatus { public net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus wrapperContained; public AdvancementObtainedStatus(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier boxTexture() { return new yarnwrap.util.Identifier(wrapperContained.boxTexture); }
// public void boxTexture(yarnwrap.util.Identifier value) { wrapperContained.boxTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier boxTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.boxTexture); }
// public static void boxTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.boxTexture = value.wrapperContained; }

// public yarnwrap.util.Identifier taskFrameTexture() { return new yarnwrap.util.Identifier(wrapperContained.taskFrameTexture); }
// public void taskFrameTexture(yarnwrap.util.Identifier value) { wrapperContained.taskFrameTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier taskFrameTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.taskFrameTexture); }
// public static void taskFrameTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.taskFrameTexture = value.wrapperContained; }

// public yarnwrap.util.Identifier challengeFrameTexture() { return new yarnwrap.util.Identifier(wrapperContained.challengeFrameTexture); }
// public void challengeFrameTexture(yarnwrap.util.Identifier value) { wrapperContained.challengeFrameTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier challengeFrameTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.challengeFrameTexture); }
// public static void challengeFrameTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.challengeFrameTexture = value.wrapperContained; }

// public yarnwrap.util.Identifier goalFrameTexture() { return new yarnwrap.util.Identifier(wrapperContained.goalFrameTexture); }
// public void goalFrameTexture(yarnwrap.util.Identifier value) { wrapperContained.goalFrameTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier goalFrameTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.goalFrameTexture); }
// public static void goalFrameTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.goalFrameTexture = value.wrapperContained; }

// // public AdvancementObtainedStatus(java.lang.String boxTexture,int taskFrameTexture,yarnwrap.util.Identifier challengeFrameTexture,yarnwrap.util.Identifier goalFrameTexture) { this.wrapperContained = new net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus(boxTexture,taskFrameTexture,challengeFrameTexture.wrapperContained,goalFrameTexture.wrapperContained); }
public yarnwrap.util.Identifier getBoxTexture() { return new yarnwrap.util.Identifier(wrapperContained.getBoxTexture()); }
// public static yarnwrap.util.Identifier getBoxTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.getBoxTexture()); }
public yarnwrap.util.Identifier getFrameTexture(yarnwrap.advancement.AdvancementFrame frame) { return new yarnwrap.util.Identifier(wrapperContained.getFrameTexture(frame.wrapperContained)); }
// public static yarnwrap.util.Identifier getFrameTexture(yarnwrap.advancement.AdvancementFrame frame, ) { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus.getFrameTexture(frame.wrapperContained)); }

}