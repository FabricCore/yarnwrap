package yarnwrap.predicate;
public class NumberRange { public net.minecraft.predicate.NumberRange wrapperContained; public NumberRange(net.minecraft.predicate.NumberRange wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXCEPTION_EMPTY() { return wrapperContained.EXCEPTION_EMPTY; }
// public void EXCEPTION_EMPTY(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.EXCEPTION_EMPTY = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXCEPTION_SWAPPED() { return wrapperContained.EXCEPTION_SWAPPED; }
// public void EXCEPTION_SWAPPED(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.EXCEPTION_SWAPPED = value; }
// public yarnwrap.predicate.NumberRange method_53188(Object either) { return new yarnwrap.predicate.NumberRange(wrapperContained.method_53188(either)); }
// public yarnwrap.predicate.NumberRange method_53189(Object value) { return new yarnwrap.predicate.NumberRange(wrapperContained.method_53189(value)); }
// public com.mojang.datafixers.util.Either method_53190(yarnwrap.predicate.NumberRange range) { return wrapperContained.method_53190(range.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec valueCodec,Object rangeFactory) { return wrapperContained.createCodec(valueCodec,rangeFactory); }
// public com.mojang.datafixers.kinds.App method_53192(com.mojang.serialization.Codec instance) { return wrapperContained.method_53192(instance); }
// public yarnwrap.predicate.NumberRange method_53193(yarnwrap.predicate.NumberRange range) { return new yarnwrap.predicate.NumberRange(wrapperContained.method_53193(range.wrapperContained)); }
public java.util.Optional getConstantValue() { return wrapperContained.getConstantValue(); }
// // public java.util.Optional fromStringReader(com.mojang.brigadier.StringReader reader,java.util.function.Function converter,java.util.function.Supplier exceptionTypeSupplier) { return wrapperContained.fromStringReader(reader,converter,exceptionTypeSupplier); }
// // public boolean isNextCharValid(com.mojang.brigadier.StringReader reader) { return wrapperContained.isNextCharValid(reader); }
public boolean isDummy() { return wrapperContained.isDummy(); }
// public yarnwrap.predicate.NumberRange parse(com.mojang.brigadier.StringReader commandReader,Object commandFactory,java.util.function.Function converter,java.util.function.Supplier exceptionTypeSupplier,java.util.function.Function mapper) { return new yarnwrap.predicate.NumberRange(wrapperContained.parse(commandReader,commandFactory,converter,exceptionTypeSupplier,mapper)); }

}