package yarnwrap.util;
public class TypedActionResult { public net.minecraft.util.TypedActionResult wrapperContained; public TypedActionResult(net.minecraft.util.TypedActionResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.ActionResult result() { return new yarnwrap.util.ActionResult(wrapperContained.result); }
// public void result(yarnwrap.util.ActionResult value) { wrapperContained.result = value.wrapperContained; }
// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
public TypedActionResult(yarnwrap.util.ActionResult result,java.lang.Object value) { this.wrapperContained = new net.minecraft.util.TypedActionResult(result.wrapperContained,value); }
public yarnwrap.util.TypedActionResult success(java.lang.Object data) { return new yarnwrap.util.TypedActionResult(wrapperContained.success(data)); }
public yarnwrap.util.TypedActionResult consume(java.lang.Object data) { return new yarnwrap.util.TypedActionResult(wrapperContained.consume(data)); }
public yarnwrap.util.TypedActionResult pass(java.lang.Object data) { return new yarnwrap.util.TypedActionResult(wrapperContained.pass(data)); }
public yarnwrap.util.TypedActionResult fail(java.lang.Object data) { return new yarnwrap.util.TypedActionResult(wrapperContained.fail(data)); }
public yarnwrap.util.TypedActionResult success(java.lang.Object data,boolean swingHand) { return new yarnwrap.util.TypedActionResult(wrapperContained.success(data,swingHand)); }
public java.lang.Object getValue() { return wrapperContained.getValue(); }
public yarnwrap.util.ActionResult getResult() { return new yarnwrap.util.ActionResult(wrapperContained.getResult()); }

}