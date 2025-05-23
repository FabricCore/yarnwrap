package yarnwrap.util.context;
public class ContextParameter { public net.minecraft.util.context.ContextParameter wrapperContained; public ContextParameter(net.minecraft.util.context.ContextParameter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.util.context.ContextParameter.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.util.context.ContextParameter.id = value.wrapperContained; }

public ContextParameter(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.util.context.ContextParameter(id.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.util.context.ContextParameter.getId()); }
// public yarnwrap.util.context.ContextParameter of(java.lang.String id) { return new yarnwrap.util.context.ContextParameter(wrapperContained.of(id)); }
// public static yarnwrap.util.context.ContextParameter of(java.lang.String id, ) { return new yarnwrap.util.context.ContextParameter(net.minecraft.util.context.ContextParameter.of(id)); }

}