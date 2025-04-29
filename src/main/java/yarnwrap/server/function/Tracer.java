package yarnwrap.server.function;
public class Tracer { public net.minecraft.server.function.Tracer wrapperContained; public Tracer(net.minecraft.server.function.Tracer wrapperContained) { this.wrapperContained = wrapperContained; }

public void traceCommandStart(int depth,java.lang.String command) { wrapperContained.traceCommandStart(depth,command); }
// public static void traceCommandStart(int depth,java.lang.String command, ) { net.minecraft.server.function.Tracer.traceCommandStart(depth,command); }
public void traceCommandEnd(int depth,java.lang.String command,int result) { wrapperContained.traceCommandEnd(depth,command,result); }
// public static void traceCommandEnd(int depth,java.lang.String command,int result, ) { net.minecraft.server.function.Tracer.traceCommandEnd(depth,command,result); }
public void traceFunctionCall(int depth,yarnwrap.util.Identifier function,int size) { wrapperContained.traceFunctionCall(depth,function.wrapperContained,size); }
// public static void traceFunctionCall(int depth,yarnwrap.util.Identifier function,int size, ) { net.minecraft.server.function.Tracer.traceFunctionCall(depth,function.wrapperContained,size); }
public void traceError(java.lang.String message) { wrapperContained.traceError(message); }
// public static void traceError(java.lang.String message, ) { net.minecraft.server.function.Tracer.traceError(message); }

}