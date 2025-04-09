package yarnwrap.predicate;
public class NumberRange { public net.minecraft.predicate.NumberRange wrapperContained; public NumberRange(net.minecraft.predicate.NumberRange wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXCEPTION_EMPTY() { return wrapperContained.EXCEPTION_EMPTY; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXCEPTION_SWAPPED() { return wrapperContained.EXCEPTION_SWAPPED; }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec valueCodec,Object rangeFactory) { return wrapperContained.createCodec(valueCodec,rangeFactory); }
public java.util.Optional getConstantValue() { return wrapperContained.getConstantValue(); }
// // public java.util.Optional fromStringReader(com.mojang.brigadier.StringReader reader,java.util.function.Function converter,java.util.function.Supplier exceptionTypeSupplier) { return wrapperContained.fromStringReader(reader,converter,exceptionTypeSupplier); }
// // public boolean isNextCharValid(com.mojang.brigadier.StringReader reader) { return wrapperContained.isNextCharValid(reader); }
public boolean isDummy() { return wrapperContained.isDummy(); }
// public yarnwrap.predicate.NumberRange parse(com.mojang.brigadier.StringReader commandReader,Object commandFactory,java.util.function.Function converter,java.util.function.Supplier exceptionTypeSupplier,java.util.function.Function mapper) { return new yarnwrap.predicate.NumberRange(wrapperContained.parse(commandReader,commandFactory,converter,exceptionTypeSupplier,mapper)); }

}