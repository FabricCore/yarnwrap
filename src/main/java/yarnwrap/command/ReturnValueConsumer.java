package yarnwrap.command;
public class ReturnValueConsumer { public net.minecraft.command.ReturnValueConsumer wrapperContained; public ReturnValueConsumer(net.minecraft.command.ReturnValueConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.ReturnValueConsumer EMPTY() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.command.ReturnValueConsumer EMPTY() { return new yarnwrap.command.ReturnValueConsumer(net.minecraft.command.ReturnValueConsumer.EMPTY); }
// public static void EMPTY(yarnwrap.command.ReturnValueConsumer value, ) { net.minecraft.command.ReturnValueConsumer.EMPTY = value.wrapperContained; }

// public yarnwrap.command.ReturnValueConsumer chain(yarnwrap.command.ReturnValueConsumer a,yarnwrap.command.ReturnValueConsumer b) { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.chain(a.wrapperContained,b.wrapperContained)); }
// public static yarnwrap.command.ReturnValueConsumer chain(yarnwrap.command.ReturnValueConsumer a,yarnwrap.command.ReturnValueConsumer b, ) { return new yarnwrap.command.ReturnValueConsumer(net.minecraft.command.ReturnValueConsumer.chain(a.wrapperContained,b.wrapperContained)); }
// public void method_54880(yarnwrap.command.ReturnValueConsumer successful,yarnwrap.command.ReturnValueConsumer returnValue) { wrapperContained.method_54880(successful.wrapperContained,returnValue.wrapperContained); }
// public static void method_54880(yarnwrap.command.ReturnValueConsumer successful,yarnwrap.command.ReturnValueConsumer returnValue, ) { net.minecraft.command.ReturnValueConsumer.method_54880(successful.wrapperContained,returnValue.wrapperContained); }
public void onResult(boolean successful,int returnValue) { wrapperContained.onResult(successful,returnValue); }
// public static void onResult(boolean successful,int returnValue, ) { net.minecraft.command.ReturnValueConsumer.onResult(successful,returnValue); }
public void onSuccess(int successful) { wrapperContained.onSuccess(successful); }
// public static void onSuccess(int successful, ) { net.minecraft.command.ReturnValueConsumer.onSuccess(successful); }

}