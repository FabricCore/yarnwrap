package yarnwrap.command;
public class EntitySelectorOptions { public net.minecraft.command.EntitySelectorOptions wrapperContained; public EntitySelectorOptions(net.minecraft.command.EntitySelectorOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_OPTION_EXCEPTION() { return wrapperContained.UNKNOWN_OPTION_EXCEPTION; }
// public void UNKNOWN_OPTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_OPTION_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_OPTION_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.UNKNOWN_OPTION_EXCEPTION; }
// public static void UNKNOWN_OPTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.UNKNOWN_OPTION_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_SMALL_LEVEL_EXCEPTION() { return wrapperContained.TOO_SMALL_LEVEL_EXCEPTION; }
// public void TOO_SMALL_LEVEL_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TOO_SMALL_LEVEL_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_SMALL_LEVEL_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.TOO_SMALL_LEVEL_EXCEPTION; }
// public static void TOO_SMALL_LEVEL_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.TOO_SMALL_LEVEL_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INAPPLICABLE_OPTION_EXCEPTION() { return wrapperContained.INAPPLICABLE_OPTION_EXCEPTION; }
// public void INAPPLICABLE_OPTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INAPPLICABLE_OPTION_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INAPPLICABLE_OPTION_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.INAPPLICABLE_OPTION_EXCEPTION; }
// public static void INAPPLICABLE_OPTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.INAPPLICABLE_OPTION_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType IRREVERSIBLE_SORT_EXCEPTION() { return wrapperContained.IRREVERSIBLE_SORT_EXCEPTION; }
// public void IRREVERSIBLE_SORT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.IRREVERSIBLE_SORT_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType IRREVERSIBLE_SORT_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.IRREVERSIBLE_SORT_EXCEPTION; }
// public static void IRREVERSIBLE_SORT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.IRREVERSIBLE_SORT_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_MODE_EXCEPTION() { return wrapperContained.INVALID_MODE_EXCEPTION; }
// public void INVALID_MODE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_MODE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_MODE_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.INVALID_MODE_EXCEPTION; }
// public static void INVALID_MODE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.INVALID_MODE_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_DISTANCE_EXCEPTION() { return wrapperContained.NEGATIVE_DISTANCE_EXCEPTION; }
// public void NEGATIVE_DISTANCE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NEGATIVE_DISTANCE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_DISTANCE_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.NEGATIVE_DISTANCE_EXCEPTION; }
// public static void NEGATIVE_DISTANCE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.NEGATIVE_DISTANCE_EXCEPTION = value; }

// public java.util.Map OPTIONS() { return wrapperContained.OPTIONS; }
// public void OPTIONS(java.util.Map value) { wrapperContained.OPTIONS = value; }
// public static java.util.Map OPTIONS() { return net.minecraft.command.EntitySelectorOptions.OPTIONS; }
// public static void OPTIONS(java.util.Map value, ) { net.minecraft.command.EntitySelectorOptions.OPTIONS = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_TYPE_EXCEPTION() { return wrapperContained.INVALID_TYPE_EXCEPTION; }
// public void INVALID_TYPE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_TYPE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_TYPE_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.INVALID_TYPE_EXCEPTION; }
// public static void INVALID_TYPE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.INVALID_TYPE_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_LEVEL_EXCEPTION() { return wrapperContained.NEGATIVE_LEVEL_EXCEPTION; }
// public void NEGATIVE_LEVEL_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NEGATIVE_LEVEL_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_LEVEL_EXCEPTION() { return net.minecraft.command.EntitySelectorOptions.NEGATIVE_LEVEL_EXCEPTION; }
// public static void NEGATIVE_LEVEL_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntitySelectorOptions.NEGATIVE_LEVEL_EXCEPTION = value; }

// public boolean method_22822(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_22822(reader.wrapperContained); }
// public static boolean method_22822(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_22822(reader.wrapperContained); }
// public boolean method_22823(yarnwrap.registry.RegistryKey entity) { return wrapperContained.method_22823(entity.wrapperContained); }
// public static boolean method_22823(yarnwrap.registry.RegistryKey entity, ) { return net.minecraft.command.EntitySelectorOptions.method_22823(entity.wrapperContained); }
// public void method_22824(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_22824(reader.wrapperContained); }
// public static void method_22824(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_22824(reader.wrapperContained); }
// public boolean method_9919(yarnwrap.entity.EntityType entity) { return wrapperContained.method_9919(entity.wrapperContained); }
// public static boolean method_9919(yarnwrap.entity.EntityType entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9919(entity.wrapperContained); }
// public boolean method_9920(java.lang.String entity) { return wrapperContained.method_9920(entity); }
// public static boolean method_9920(java.lang.String entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9920(entity); }
// public java.util.concurrent.CompletableFuture method_9921(yarnwrap.command.EntitySelectorReader builder,com.mojang.brigadier.suggestion.SuggestionsBuilder consumer) { return wrapperContained.method_9921(builder.wrapperContained,consumer); }
// public static java.util.concurrent.CompletableFuture method_9921(yarnwrap.command.EntitySelectorReader builder,com.mojang.brigadier.suggestion.SuggestionsBuilder consumer, ) { return net.minecraft.command.EntitySelectorOptions.method_9921(builder.wrapperContained,consumer); }
// public boolean method_9922(java.lang.String entity) { return wrapperContained.method_9922(entity); }
// public static boolean method_9922(java.lang.String entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9922(entity); }
// public com.mojang.brigadier.Message method_9923(java.lang.Object option) { return wrapperContained.method_9923(option); }
// public static com.mojang.brigadier.Message method_9923(java.lang.Object option, ) { return net.minecraft.command.EntitySelectorOptions.method_9923(option); }
// public boolean method_9924(boolean entity) { return wrapperContained.method_9924(entity); }
// public static boolean method_9924(boolean entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9924(entity); }
// public boolean method_9925(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9925(reader.wrapperContained); }
// public static boolean method_9925(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9925(reader.wrapperContained); }
// public boolean method_9926(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9926(reader.wrapperContained); }
// public static boolean method_9926(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9926(reader.wrapperContained); }
// public boolean method_9927(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9927(reader.wrapperContained); }
// public static boolean method_9927(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9927(reader.wrapperContained); }
// public boolean method_9928(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9928(reader.wrapperContained); }
// public static boolean method_9928(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9928(reader.wrapperContained); }
// public boolean method_9929(java.util.Map advancementProgress) { return wrapperContained.method_9929(advancementProgress); }
// public static boolean method_9929(java.util.Map advancementProgress, ) { return net.minecraft.command.EntitySelectorOptions.method_9929(advancementProgress); }
// public void suggestOptions(yarnwrap.command.EntitySelectorReader reader,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionBuilder) { wrapperContained.suggestOptions(reader.wrapperContained,suggestionBuilder); }
// public static void suggestOptions(yarnwrap.command.EntitySelectorReader reader,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionBuilder, ) { net.minecraft.command.EntitySelectorOptions.suggestOptions(reader.wrapperContained,suggestionBuilder); }
// public boolean method_9931(boolean criterionProgress) { return wrapperContained.method_9931(criterionProgress); }
// public static boolean method_9931(boolean criterionProgress, ) { return net.minecraft.command.EntitySelectorOptions.method_9931(criterionProgress); }
// public com.mojang.brigadier.Message method_9932(java.lang.Object gameMode) { return wrapperContained.method_9932(gameMode); }
// public static com.mojang.brigadier.Message method_9932(java.lang.Object gameMode, ) { return net.minecraft.command.EntitySelectorOptions.method_9932(gameMode); }
// public boolean method_9933(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9933(reader.wrapperContained); }
// public static boolean method_9933(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9933(reader.wrapperContained); }
// public boolean method_9934(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9934(reader.wrapperContained); }
// public static boolean method_9934(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9934(reader.wrapperContained); }
// public boolean method_9935(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9935(reader.wrapperContained); }
// public static boolean method_9935(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9935(reader.wrapperContained); }
// public boolean method_9936(boolean advancementProgress) { return wrapperContained.method_9936(advancementProgress); }
// public static boolean method_9936(boolean advancementProgress, ) { return net.minecraft.command.EntitySelectorOptions.method_9936(advancementProgress); }
// public boolean method_9937(java.util.Map entity) { return wrapperContained.method_9937(entity); }
// public static boolean method_9937(java.util.Map entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9937(entity); }
// public boolean method_9938(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9938(reader.wrapperContained); }
// public static boolean method_9938(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9938(reader.wrapperContained); }
// public boolean method_9939(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9939(reader.wrapperContained); }
// public static boolean method_9939(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9939(reader.wrapperContained); }
// public boolean method_9940(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9940(reader.wrapperContained); }
// public static boolean method_9940(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9940(reader.wrapperContained); }
// public boolean method_9941(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9941(reader.wrapperContained); }
// public static boolean method_9941(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9941(reader.wrapperContained); }
// public boolean method_9942(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9942(reader.wrapperContained); }
// public static boolean method_9942(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9942(reader.wrapperContained); }
// public boolean method_9943(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9943(reader.wrapperContained); }
// public static boolean method_9943(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9943(reader.wrapperContained); }
// public boolean method_9944(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9944(reader.wrapperContained); }
// public static boolean method_9944(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9944(reader.wrapperContained); }
// public boolean method_9945(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9945(reader.wrapperContained); }
// public static boolean method_9945(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9945(reader.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_9946(yarnwrap.command.EntitySelectorReader builder,com.mojang.brigadier.suggestion.SuggestionsBuilder consumer) { return wrapperContained.method_9946(builder.wrapperContained,consumer); }
// public static java.util.concurrent.CompletableFuture method_9946(yarnwrap.command.EntitySelectorReader builder,com.mojang.brigadier.suggestion.SuggestionsBuilder consumer, ) { return net.minecraft.command.EntitySelectorOptions.method_9946(builder.wrapperContained,consumer); }
// public boolean method_9947(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9947(reader.wrapperContained); }
// public static boolean method_9947(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9947(reader.wrapperContained); }
// public void method_9948(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9948(reader.wrapperContained); }
// public static void method_9948(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9948(reader.wrapperContained); }
// public boolean method_9949(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9949(reader.wrapperContained); }
// public static boolean method_9949(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9949(reader.wrapperContained); }
// public boolean method_9950(yarnwrap.registry.tag.TagKey entity) { return wrapperContained.method_9950(entity.wrapperContained); }
// public static boolean method_9950(yarnwrap.registry.tag.TagKey entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9950(entity.wrapperContained); }
// public void method_9951(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9951(reader.wrapperContained); }
// public static void method_9951(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9951(reader.wrapperContained); }
// public boolean method_9952(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9952(reader.wrapperContained); }
// public static boolean method_9952(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9952(reader.wrapperContained); }
// public void method_9953(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9953(reader.wrapperContained); }
// public static void method_9953(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9953(reader.wrapperContained); }
// public boolean method_9954(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9954(reader.wrapperContained); }
// public static boolean method_9954(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9954(reader.wrapperContained); }
// public boolean method_9955(yarnwrap.command.EntitySelectorReader reader) { return wrapperContained.method_9955(reader.wrapperContained); }
// public static boolean method_9955(yarnwrap.command.EntitySelectorReader reader, ) { return net.minecraft.command.EntitySelectorOptions.method_9955(reader.wrapperContained); }
// public com.mojang.brigadier.Message method_9956(java.lang.Object sortType) { return wrapperContained.method_9956(sortType); }
// public static com.mojang.brigadier.Message method_9956(java.lang.Object sortType, ) { return net.minecraft.command.EntitySelectorOptions.method_9956(sortType); }
// public boolean method_9957(yarnwrap.nbt.NbtCompound entity) { return wrapperContained.method_9957(entity.wrapperContained); }
// public static boolean method_9957(yarnwrap.nbt.NbtCompound entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9957(entity.wrapperContained); }
// public boolean method_9958(java.util.Map entity) { return wrapperContained.method_9958(entity); }
// public static boolean method_9958(java.util.Map entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9958(entity); }
// public com.mojang.brigadier.Message method_9959(java.lang.Object option) { return wrapperContained.method_9959(option); }
// public static com.mojang.brigadier.Message method_9959(java.lang.Object option, ) { return net.minecraft.command.EntitySelectorOptions.method_9959(option); }
// public void register() { wrapperContained.register(); }
public static void register() { net.minecraft.command.EntitySelectorOptions.register(); }
// public void putOption(java.lang.String id,Object handler,java.util.function.Predicate condition,yarnwrap.text.Text description) { wrapperContained.putOption(id,handler,condition,description.wrapperContained); }
// public static void putOption(java.lang.String id,Object handler,java.util.function.Predicate condition,yarnwrap.text.Text description, ) { net.minecraft.command.EntitySelectorOptions.putOption(id,handler,condition,description.wrapperContained); }
// public void method_9962(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9962(reader.wrapperContained); }
// public static void method_9962(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9962(reader.wrapperContained); }
// public void method_9963(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9963(reader.wrapperContained); }
// public static void method_9963(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9963(reader.wrapperContained); }
// public com.mojang.brigadier.Message method_9964(java.lang.Object entity) { return wrapperContained.method_9964(entity); }
// public static com.mojang.brigadier.Message method_9964(java.lang.Object entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9964(entity); }
// public boolean method_9965(java.lang.String entity) { return wrapperContained.method_9965(entity); }
// public static boolean method_9965(java.lang.String entity, ) { return net.minecraft.command.EntitySelectorOptions.method_9965(entity); }
// public void method_9966(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9966(reader.wrapperContained); }
// public static void method_9966(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9966(reader.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_9967(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.method_9967(builder,consumer); }
// public static java.util.concurrent.CompletableFuture method_9967(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorOptions.method_9967(builder,consumer); }
// public void method_9968(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9968(reader.wrapperContained); }
// public static void method_9968(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9968(reader.wrapperContained); }
// public void method_9969(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9969(reader.wrapperContained); }
// public static void method_9969(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9969(reader.wrapperContained); }
// public void method_9970(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9970(reader.wrapperContained); }
// public static void method_9970(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9970(reader.wrapperContained); }
// public void method_9971(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9971(reader.wrapperContained); }
// public static void method_9971(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9971(reader.wrapperContained); }
// public void method_9972(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9972(reader.wrapperContained); }
// public static void method_9972(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9972(reader.wrapperContained); }
// public void method_9973(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9973(reader.wrapperContained); }
// public static void method_9973(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9973(reader.wrapperContained); }
// public void method_9974(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9974(reader.wrapperContained); }
// public static void method_9974(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9974(reader.wrapperContained); }
// public void method_9975(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9975(reader.wrapperContained); }
// public static void method_9975(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9975(reader.wrapperContained); }
// public Object getHandler(yarnwrap.command.EntitySelectorReader reader,java.lang.String option,int restoreCursor) { return wrapperContained.getHandler(reader.wrapperContained,option,restoreCursor); }
// public static Object getHandler(yarnwrap.command.EntitySelectorReader reader,java.lang.String option,int restoreCursor, ) { return net.minecraft.command.EntitySelectorOptions.getHandler(reader.wrapperContained,option,restoreCursor); }
// public void method_9977(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9977(reader.wrapperContained); }
// public static void method_9977(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9977(reader.wrapperContained); }
// public void method_9978(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9978(reader.wrapperContained); }
// public static void method_9978(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9978(reader.wrapperContained); }
// public void method_9979(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9979(reader.wrapperContained); }
// public static void method_9979(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9979(reader.wrapperContained); }
// public void method_9980(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9980(reader.wrapperContained); }
// public static void method_9980(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9980(reader.wrapperContained); }
// public void method_9981(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9981(reader.wrapperContained); }
// public static void method_9981(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9981(reader.wrapperContained); }
// public void method_9982(yarnwrap.command.EntitySelectorReader reader) { wrapperContained.method_9982(reader.wrapperContained); }
// public static void method_9982(yarnwrap.command.EntitySelectorReader reader, ) { net.minecraft.command.EntitySelectorOptions.method_9982(reader.wrapperContained); }

}