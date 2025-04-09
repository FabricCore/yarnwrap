package yarnwrap.client.tutorial;
public class TutorialStep { public net.minecraft.client.tutorial.TutorialStep wrapperContained; public TutorialStep(net.minecraft.client.tutorial.TutorialStep wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function handlerFactory() { return wrapperContained.handlerFactory; }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.client.tutorial.TutorialStepHandler createHandler(yarnwrap.client.tutorial.TutorialManager manager) { return new yarnwrap.client.tutorial.TutorialStepHandler(wrapperContained.createHandler(manager.wrapperContained)); }
public yarnwrap.client.tutorial.TutorialStep byName(java.lang.String name) { return new yarnwrap.client.tutorial.TutorialStep(wrapperContained.byName(name)); }
public java.lang.String getName() { return wrapperContained.getName(); }

}