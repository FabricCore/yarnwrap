package yarnwrap.client.gui.screen.advancement;
public class AdvancementObtainedStatus { public net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus wrapperContained; public AdvancementObtainedStatus(net.minecraft.client.gui.screen.advancement.AdvancementObtainedStatus wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier boxTexture() { return new yarnwrap.util.Identifier(wrapperContained.boxTexture); }
// public yarnwrap.util.Identifier taskFrameTexture() { return new yarnwrap.util.Identifier(wrapperContained.taskFrameTexture); }
// public yarnwrap.util.Identifier challengeFrameTexture() { return new yarnwrap.util.Identifier(wrapperContained.challengeFrameTexture); }
// public yarnwrap.util.Identifier goalFrameTexture() { return new yarnwrap.util.Identifier(wrapperContained.goalFrameTexture); }
public yarnwrap.util.Identifier getBoxTexture() { return new yarnwrap.util.Identifier(wrapperContained.getBoxTexture()); }
public yarnwrap.util.Identifier getFrameTexture(yarnwrap.advancement.AdvancementFrame frame) { return new yarnwrap.util.Identifier(wrapperContained.getFrameTexture(frame.wrapperContained)); }

}