package yarnwrap.util.context;
public class ContextType { public net.minecraft.util.context.ContextType wrapperContained; public ContextType(net.minecraft.util.context.ContextType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set required() { return wrapperContained.required; }
// public void required(java.util.Set value) { wrapperContained.required = value; }
// public static java.util.Set required() { return net.minecraft.util.context.ContextType.required; }
// public static void required(java.util.Set value, ) { net.minecraft.util.context.ContextType.required = value; }

// public java.util.Set allowed() { return wrapperContained.allowed; }
// public void allowed(java.util.Set value) { wrapperContained.allowed = value; }
// public static java.util.Set allowed() { return net.minecraft.util.context.ContextType.allowed; }
// public static void allowed(java.util.Set value, ) { net.minecraft.util.context.ContextType.allowed = value; }

// public ContextType(java.util.Set required,java.util.Set allowed) { this.wrapperContained = new net.minecraft.util.context.ContextType(required,allowed); }
public java.util.Set getAllowed() { return wrapperContained.getAllowed(); }
// public static java.util.Set getAllowed() { return net.minecraft.util.context.ContextType.getAllowed(); }
public java.util.Set getRequired() { return wrapperContained.getRequired(); }
// public static java.util.Set getRequired() { return net.minecraft.util.context.ContextType.getRequired(); }
// public java.lang.String method_779(yarnwrap.util.context.ContextParameter parameter) { return wrapperContained.method_779(parameter.wrapperContained); }
// public static java.lang.String method_779(yarnwrap.util.context.ContextParameter parameter, ) { return net.minecraft.util.context.ContextType.method_779(parameter.wrapperContained); }

}