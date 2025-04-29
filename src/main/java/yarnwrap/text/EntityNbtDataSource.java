package yarnwrap.text;
public class EntityNbtDataSource { public net.minecraft.text.EntityNbtDataSource wrapperContained; public EntityNbtDataSource(net.minecraft.text.EntityNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String rawSelector() { return wrapperContained.rawSelector; }
// public void rawSelector(java.lang.String value) { wrapperContained.rawSelector = value; }
// public static java.lang.String rawSelector() { return net.minecraft.text.EntityNbtDataSource.rawSelector; }
// public static void rawSelector(java.lang.String value, ) { net.minecraft.text.EntityNbtDataSource.rawSelector = value; }

// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector); }
// public void selector(yarnwrap.command.EntitySelector value) { wrapperContained.selector = value.wrapperContained; }
// public static yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(net.minecraft.text.EntityNbtDataSource.selector); }
// public static void selector(yarnwrap.command.EntitySelector value, ) { net.minecraft.text.EntityNbtDataSource.selector = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.text.EntityNbtDataSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.text.EntityNbtDataSource.CODEC = value; }

// public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public static Object TYPE() { return net.minecraft.text.EntityNbtDataSource.TYPE; }
// // public static void TYPE(Object value, ) { net.minecraft.text.EntityNbtDataSource.TYPE = value; }

public EntityNbtDataSource(java.lang.String rawPath) { this.wrapperContained = new net.minecraft.text.EntityNbtDataSource(rawPath); }
// public EntityNbtDataSource(java.lang.String rawPath) { this.wrapperContained = new net.minecraft.text.EntityNbtDataSource(rawPath); }
// public java.lang.String rawSelector() { return wrapperContained.rawSelector(); }
// // public static java.lang.String rawSelector() { return net.minecraft.text.EntityNbtDataSource.rawSelector(); }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector()); }
// // public static yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(net.minecraft.text.EntityNbtDataSource.selector()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.EntityNbtDataSource.equals(o); }
// public yarnwrap.command.EntitySelector parseSelector(java.lang.String rawSelector) { return new yarnwrap.command.EntitySelector(wrapperContained.parseSelector(rawSelector)); }
// public static yarnwrap.command.EntitySelector parseSelector(java.lang.String rawSelector, ) { return new yarnwrap.command.EntitySelector(net.minecraft.text.EntityNbtDataSource.parseSelector(rawSelector)); }
// public com.mojang.datafixers.kinds.App method_54227(Object instance) { return wrapperContained.method_54227(instance); }
// public static com.mojang.datafixers.kinds.App method_54227(Object instance, ) { return net.minecraft.text.EntityNbtDataSource.method_54227(instance); }

}