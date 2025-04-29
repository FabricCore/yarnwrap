package yarnwrap.client.tutorial;
public class TutorialStep { public net.minecraft.client.tutorial.TutorialStep wrapperContained; public TutorialStep(net.minecraft.client.tutorial.TutorialStep wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function handlerFactory() { return wrapperContained.handlerFactory; }
// public void handlerFactory(java.util.function.Function value) { wrapperContained.handlerFactory = value; }
// public static java.util.function.Function handlerFactory() { return net.minecraft.client.tutorial.TutorialStep.handlerFactory; }
// public static void handlerFactory(java.util.function.Function value, ) { net.minecraft.client.tutorial.TutorialStep.handlerFactory = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.tutorial.TutorialStep.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.tutorial.TutorialStep.name = value; }

// public TutorialStep(java.lang.String name,int factory) { this.wrapperContained = new net.minecraft.client.tutorial.TutorialStep(name,factory); }
public yarnwrap.client.tutorial.TutorialStepHandler createHandler(yarnwrap.client.tutorial.TutorialManager manager) { return new yarnwrap.client.tutorial.TutorialStepHandler(wrapperContained.createHandler(manager.wrapperContained)); }
// public static yarnwrap.client.tutorial.TutorialStepHandler createHandler(yarnwrap.client.tutorial.TutorialManager manager, ) { return new yarnwrap.client.tutorial.TutorialStepHandler(net.minecraft.client.tutorial.TutorialStep.createHandler(manager.wrapperContained)); }
// public yarnwrap.client.tutorial.TutorialStep byName(java.lang.String name) { return new yarnwrap.client.tutorial.TutorialStep(wrapperContained.byName(name)); }
// public static yarnwrap.client.tutorial.TutorialStep byName(java.lang.String name, ) { return new yarnwrap.client.tutorial.TutorialStep(net.minecraft.client.tutorial.TutorialStep.byName(name)); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.client.tutorial.TutorialStep.getName(); }

}