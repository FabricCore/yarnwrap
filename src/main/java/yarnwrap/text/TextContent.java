package yarnwrap.text;
public class TextContent { public net.minecraft.text.TextContent wrapperContained; public TextContent(net.minecraft.text.TextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.MutableText parse(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity sender,int depth) { return new yarnwrap.text.MutableText(wrapperContained.parse(source.wrapperContained,sender.wrapperContained,depth)); }
// public static yarnwrap.text.MutableText parse(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity sender,int depth, ) { return new yarnwrap.text.MutableText(net.minecraft.text.TextContent.parse(source.wrapperContained,sender.wrapperContained,depth)); }
// public java.util.Optional visit(Object visitor) { return wrapperContained.visit(visitor); }
// public static java.util.Optional visit(Object visitor, ) { return net.minecraft.text.TextContent.visit(visitor); }
// public java.util.Optional visit(Object visitor,yarnwrap.text.Style style) { return wrapperContained.visit(visitor,style.wrapperContained); }
// public static java.util.Optional visit(Object visitor,yarnwrap.text.Style style, ) { return net.minecraft.text.TextContent.visit(visitor,style.wrapperContained); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.text.TextContent.getType(); }

}