package yarnwrap.client.tutorial;
public class NoneTutorialStepHandler { public net.minecraft.client.tutorial.NoneTutorialStepHandler wrapperContained; public NoneTutorialStepHandler(net.minecraft.client.tutorial.NoneTutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public NoneTutorialStepHandler(yarnwrap.client.tutorial.TutorialManager manager) { this.wrapperContained = new net.minecraft.client.tutorial.NoneTutorialStepHandler(manager.wrapperContained); }

}