package yarnwrap.command;
public class EntitySelectorReader { public net.minecraft.command.EntitySelectorReader wrapperContained; public EntitySelectorReader(net.minecraft.command.EntitySelectorReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNTERMINATED_EXCEPTION() { return wrapperContained.UNTERMINATED_EXCEPTION; }
// public void UNTERMINATED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.UNTERMINATED_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNTERMINATED_EXCEPTION() { return net.minecraft.command.EntitySelectorReader.UNTERMINATED_EXCEPTION; }
// public static void UNTERMINATED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntitySelectorReader.UNTERMINATED_EXCEPTION = value; }

// public Object distance() { return wrapperContained.distance; }
// // public void distance(Object value) { wrapperContained.distance = value; }
// // public static Object distance() { return net.minecraft.command.EntitySelectorReader.distance; }
// // public static void distance(Object value, ) { net.minecraft.command.EntitySelectorReader.distance = value; }

// public java.lang.Double z() { return wrapperContained.z; }
// public void z(java.lang.Double value) { wrapperContained.z = value; }
// public static java.lang.Double z() { return net.minecraft.command.EntitySelectorReader.z; }
// public static void z(java.lang.Double value, ) { net.minecraft.command.EntitySelectorReader.z = value; }

// public boolean usesAt() { return wrapperContained.usesAt; }
// public void usesAt(boolean value) { wrapperContained.usesAt = value; }
// public static boolean usesAt() { return net.minecraft.command.EntitySelectorReader.usesAt; }
// public static void usesAt(boolean value, ) { net.minecraft.command.EntitySelectorReader.usesAt = value; }

// public boolean selectsScores() { return wrapperContained.selectsScores; }
// public void selectsScores(boolean value) { wrapperContained.selectsScores = value; }
// public static boolean selectsScores() { return net.minecraft.command.EntitySelectorReader.selectsScores; }
// public static void selectsScores(boolean value, ) { net.minecraft.command.EntitySelectorReader.selectsScores = value; }

// public Object levelRange() { return wrapperContained.levelRange; }
// // public void levelRange(Object value) { wrapperContained.levelRange = value; }
// // public static Object levelRange() { return net.minecraft.command.EntitySelectorReader.levelRange; }
// // public static void levelRange(Object value, ) { net.minecraft.command.EntitySelectorReader.levelRange = value; }

// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers; }
// public void includesNonPlayers(boolean value) { wrapperContained.includesNonPlayers = value; }
// public static boolean includesNonPlayers() { return net.minecraft.command.EntitySelectorReader.includesNonPlayers; }
// public static void includesNonPlayers(boolean value, ) { net.minecraft.command.EntitySelectorReader.includesNonPlayers = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_EXCEPTION() { return wrapperContained.MISSING_EXCEPTION; }
// public void MISSING_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.MISSING_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_EXCEPTION() { return net.minecraft.command.EntitySelectorReader.MISSING_EXCEPTION; }
// public static void MISSING_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntitySelectorReader.MISSING_EXCEPTION = value; }

// public boolean selectsTeam() { return wrapperContained.selectsTeam; }
// public void selectsTeam(boolean value) { wrapperContained.selectsTeam = value; }
// public static boolean selectsTeam() { return net.minecraft.command.EntitySelectorReader.selectsTeam; }
// public static void selectsTeam(boolean value, ) { net.minecraft.command.EntitySelectorReader.selectsTeam = value; }

// public boolean atAllowed() { return wrapperContained.atAllowed; }
// public void atAllowed(boolean value) { wrapperContained.atAllowed = value; }
// public static boolean atAllowed() { return net.minecraft.command.EntitySelectorReader.atAllowed; }
// public static void atAllowed(boolean value, ) { net.minecraft.command.EntitySelectorReader.atAllowed = value; }

// public java.util.function.BiConsumer sorter() { return wrapperContained.sorter; }
// public void sorter(java.util.function.BiConsumer value) { wrapperContained.sorter = value; }
// public static java.util.function.BiConsumer sorter() { return net.minecraft.command.EntitySelectorReader.sorter; }
// public static void sorter(java.util.function.BiConsumer value, ) { net.minecraft.command.EntitySelectorReader.sorter = value; }

// public java.util.function.BiFunction suggestionProvider() { return wrapperContained.suggestionProvider; }
// public void suggestionProvider(java.util.function.BiFunction value) { wrapperContained.suggestionProvider = value; }
// public static java.util.function.BiFunction suggestionProvider() { return net.minecraft.command.EntitySelectorReader.suggestionProvider; }
// public static void suggestionProvider(java.util.function.BiFunction value, ) { net.minecraft.command.EntitySelectorReader.suggestionProvider = value; }

// public boolean selectsGameMode() { return wrapperContained.selectsGameMode; }
// public void selectsGameMode(boolean value) { wrapperContained.selectsGameMode = value; }
// public static boolean selectsGameMode() { return net.minecraft.command.EntitySelectorReader.selectsGameMode; }
// public static void selectsGameMode(boolean value, ) { net.minecraft.command.EntitySelectorReader.selectsGameMode = value; }

// public java.util.function.BiConsumer RANDOM() { return wrapperContained.RANDOM; }
// public void RANDOM(java.util.function.BiConsumer value) { wrapperContained.RANDOM = value; }
public static java.util.function.BiConsumer RANDOM() { return net.minecraft.command.EntitySelectorReader.RANDOM; }
// public static void RANDOM(java.util.function.BiConsumer value, ) { net.minecraft.command.EntitySelectorReader.RANDOM = value; }

// public boolean hasLimit() { return wrapperContained.hasLimit; }
// public void hasLimit(boolean value) { wrapperContained.hasLimit = value; }
// public static boolean hasLimit() { return net.minecraft.command.EntitySelectorReader.hasLimit; }
// public static void hasLimit(boolean value, ) { net.minecraft.command.EntitySelectorReader.hasLimit = value; }

// public java.lang.Double dy() { return wrapperContained.dy; }
// public void dy(java.lang.Double value) { wrapperContained.dy = value; }
// public static java.lang.Double dy() { return net.minecraft.command.EntitySelectorReader.dy; }
// public static void dy(java.lang.Double value, ) { net.minecraft.command.EntitySelectorReader.dy = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_SELECTOR_EXCEPTION() { return wrapperContained.UNKNOWN_SELECTOR_EXCEPTION; }
// public void UNKNOWN_SELECTOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_SELECTOR_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_SELECTOR_EXCEPTION() { return net.minecraft.command.EntitySelectorReader.UNKNOWN_SELECTOR_EXCEPTION; }
// public static void UNKNOWN_SELECTOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.EntitySelectorReader.UNKNOWN_SELECTOR_EXCEPTION = value; }

// public boolean selectsName() { return wrapperContained.selectsName; }
// public void selectsName(boolean value) { wrapperContained.selectsName = value; }
// public static boolean selectsName() { return net.minecraft.command.EntitySelectorReader.selectsName; }
// public static void selectsName(boolean value, ) { net.minecraft.command.EntitySelectorReader.selectsName = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType VALUELESS_EXCEPTION() { return wrapperContained.VALUELESS_EXCEPTION; }
// public void VALUELESS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.VALUELESS_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType VALUELESS_EXCEPTION() { return net.minecraft.command.EntitySelectorReader.VALUELESS_EXCEPTION; }
// public static void VALUELESS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.EntitySelectorReader.VALUELESS_EXCEPTION = value; }

// public java.lang.Double x() { return wrapperContained.x; }
// public void x(java.lang.Double value) { wrapperContained.x = value; }
// public static java.lang.Double x() { return net.minecraft.command.EntitySelectorReader.x; }
// public static void x(java.lang.Double value, ) { net.minecraft.command.EntitySelectorReader.x = value; }

// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public static int limit() { return net.minecraft.command.EntitySelectorReader.limit; }
// public static void limit(int value, ) { net.minecraft.command.EntitySelectorReader.limit = value; }

// public yarnwrap.command.FloatRangeArgument yawRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.yawRange); }
// public void yawRange(yarnwrap.command.FloatRangeArgument value) { wrapperContained.yawRange = value.wrapperContained; }
// public static yarnwrap.command.FloatRangeArgument yawRange() { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.EntitySelectorReader.yawRange); }
// public static void yawRange(yarnwrap.command.FloatRangeArgument value, ) { net.minecraft.command.EntitySelectorReader.yawRange = value.wrapperContained; }

// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public void reader(com.mojang.brigadier.StringReader value) { wrapperContained.reader = value; }
// public static com.mojang.brigadier.StringReader reader() { return net.minecraft.command.EntitySelectorReader.reader; }
// public static void reader(com.mojang.brigadier.StringReader value, ) { net.minecraft.command.EntitySelectorReader.reader = value; }

// public int startCursor() { return wrapperContained.startCursor; }
// public void startCursor(int value) { wrapperContained.startCursor = value; }
// public static int startCursor() { return net.minecraft.command.EntitySelectorReader.startCursor; }
// public static void startCursor(int value, ) { net.minecraft.command.EntitySelectorReader.startCursor = value; }

// public java.lang.Double dx() { return wrapperContained.dx; }
// public void dx(java.lang.Double value) { wrapperContained.dx = value; }
// public static java.lang.Double dx() { return net.minecraft.command.EntitySelectorReader.dx; }
// public static void dx(java.lang.Double value, ) { net.minecraft.command.EntitySelectorReader.dx = value; }

// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public void entityType(yarnwrap.entity.EntityType value) { wrapperContained.entityType = value.wrapperContained; }
// public static yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(net.minecraft.command.EntitySelectorReader.entityType); }
// public static void entityType(yarnwrap.entity.EntityType value, ) { net.minecraft.command.EntitySelectorReader.entityType = value.wrapperContained; }

// public boolean selectsAdvancements() { return wrapperContained.selectsAdvancements; }
// public void selectsAdvancements(boolean value) { wrapperContained.selectsAdvancements = value; }
// public static boolean selectsAdvancements() { return net.minecraft.command.EntitySelectorReader.selectsAdvancements; }
// public static void selectsAdvancements(boolean value, ) { net.minecraft.command.EntitySelectorReader.selectsAdvancements = value; }

// public boolean excludesEntityType() { return wrapperContained.excludesEntityType; }
// public void excludesEntityType(boolean value) { wrapperContained.excludesEntityType = value; }
// public static boolean excludesEntityType() { return net.minecraft.command.EntitySelectorReader.excludesEntityType; }
// public static void excludesEntityType(boolean value, ) { net.minecraft.command.EntitySelectorReader.excludesEntityType = value; }

// public boolean localWorldOnly() { return wrapperContained.localWorldOnly; }
// public void localWorldOnly(boolean value) { wrapperContained.localWorldOnly = value; }
// public static boolean localWorldOnly() { return net.minecraft.command.EntitySelectorReader.localWorldOnly; }
// public static void localWorldOnly(boolean value, ) { net.minecraft.command.EntitySelectorReader.localWorldOnly = value; }

// public java.util.function.BiFunction DEFAULT_SUGGESTION_PROVIDER() { return wrapperContained.DEFAULT_SUGGESTION_PROVIDER; }
// public void DEFAULT_SUGGESTION_PROVIDER(java.util.function.BiFunction value) { wrapperContained.DEFAULT_SUGGESTION_PROVIDER = value; }
public static java.util.function.BiFunction DEFAULT_SUGGESTION_PROVIDER() { return net.minecraft.command.EntitySelectorReader.DEFAULT_SUGGESTION_PROVIDER; }
// public static void DEFAULT_SUGGESTION_PROVIDER(java.util.function.BiFunction value, ) { net.minecraft.command.EntitySelectorReader.DEFAULT_SUGGESTION_PROVIDER = value; }

// public boolean excludesTeam() { return wrapperContained.excludesTeam; }
// public void excludesTeam(boolean value) { wrapperContained.excludesTeam = value; }
// public static boolean excludesTeam() { return net.minecraft.command.EntitySelectorReader.excludesTeam; }
// public static void excludesTeam(boolean value, ) { net.minecraft.command.EntitySelectorReader.excludesTeam = value; }

// public java.util.function.BiConsumer NEAREST() { return wrapperContained.NEAREST; }
// public void NEAREST(java.util.function.BiConsumer value) { wrapperContained.NEAREST = value; }
public static java.util.function.BiConsumer NEAREST() { return net.minecraft.command.EntitySelectorReader.NEAREST; }
// public static void NEAREST(java.util.function.BiConsumer value, ) { net.minecraft.command.EntitySelectorReader.NEAREST = value; }

// public java.util.List predicates() { return wrapperContained.predicates; }
// public void predicates(java.util.List value) { wrapperContained.predicates = value; }
// public static java.util.List predicates() { return net.minecraft.command.EntitySelectorReader.predicates; }
// public static void predicates(java.util.List value, ) { net.minecraft.command.EntitySelectorReader.predicates = value; }

// public boolean excludesGameMode() { return wrapperContained.excludesGameMode; }
// public void excludesGameMode(boolean value) { wrapperContained.excludesGameMode = value; }
// public static boolean excludesGameMode() { return net.minecraft.command.EntitySelectorReader.excludesGameMode; }
// public static void excludesGameMode(boolean value, ) { net.minecraft.command.EntitySelectorReader.excludesGameMode = value; }

// public java.lang.Double y() { return wrapperContained.y; }
// public void y(java.lang.Double value) { wrapperContained.y = value; }
// public static java.lang.Double y() { return net.minecraft.command.EntitySelectorReader.y; }
// public static void y(java.lang.Double value, ) { net.minecraft.command.EntitySelectorReader.y = value; }

// public boolean hasSorter() { return wrapperContained.hasSorter; }
// public void hasSorter(boolean value) { wrapperContained.hasSorter = value; }
// public static boolean hasSorter() { return net.minecraft.command.EntitySelectorReader.hasSorter; }
// public static void hasSorter(boolean value, ) { net.minecraft.command.EntitySelectorReader.hasSorter = value; }

// public boolean excludesName() { return wrapperContained.excludesName; }
// public void excludesName(boolean value) { wrapperContained.excludesName = value; }
// public static boolean excludesName() { return net.minecraft.command.EntitySelectorReader.excludesName; }
// public static void excludesName(boolean value, ) { net.minecraft.command.EntitySelectorReader.excludesName = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return wrapperContained.INVALID_ENTITY_EXCEPTION; }
// public void INVALID_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_ENTITY_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return net.minecraft.command.EntitySelectorReader.INVALID_ENTITY_EXCEPTION; }
// public static void INVALID_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntitySelectorReader.INVALID_ENTITY_EXCEPTION = value; }

// public java.lang.String playerName() { return wrapperContained.playerName; }
// public void playerName(java.lang.String value) { wrapperContained.playerName = value; }
// public static java.lang.String playerName() { return net.minecraft.command.EntitySelectorReader.playerName; }
// public static void playerName(java.lang.String value, ) { net.minecraft.command.EntitySelectorReader.playerName = value; }

// public yarnwrap.command.FloatRangeArgument pitchRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.pitchRange); }
// public void pitchRange(yarnwrap.command.FloatRangeArgument value) { wrapperContained.pitchRange = value.wrapperContained; }
// public static yarnwrap.command.FloatRangeArgument pitchRange() { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.EntitySelectorReader.pitchRange); }
// public static void pitchRange(yarnwrap.command.FloatRangeArgument value, ) { net.minecraft.command.EntitySelectorReader.pitchRange = value.wrapperContained; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public static java.util.UUID uuid() { return net.minecraft.command.EntitySelectorReader.uuid; }
// public static void uuid(java.util.UUID value, ) { net.minecraft.command.EntitySelectorReader.uuid = value; }

// public boolean senderOnly() { return wrapperContained.senderOnly; }
// public void senderOnly(boolean value) { wrapperContained.senderOnly = value; }
// public static boolean senderOnly() { return net.minecraft.command.EntitySelectorReader.senderOnly; }
// public static void senderOnly(boolean value, ) { net.minecraft.command.EntitySelectorReader.senderOnly = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_ALLOWED_EXCEPTION() { return wrapperContained.NOT_ALLOWED_EXCEPTION; }
// public void NOT_ALLOWED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NOT_ALLOWED_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_ALLOWED_EXCEPTION() { return net.minecraft.command.EntitySelectorReader.NOT_ALLOWED_EXCEPTION; }
// public static void NOT_ALLOWED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntitySelectorReader.NOT_ALLOWED_EXCEPTION = value; }

// public java.lang.Double dz() { return wrapperContained.dz; }
// public void dz(java.lang.Double value) { wrapperContained.dz = value; }
// public static java.lang.Double dz() { return net.minecraft.command.EntitySelectorReader.dz; }
// public static void dz(java.lang.Double value, ) { net.minecraft.command.EntitySelectorReader.dz = value; }

// public java.util.function.BiConsumer FURTHEST() { return wrapperContained.FURTHEST; }
// public void FURTHEST(java.util.function.BiConsumer value) { wrapperContained.FURTHEST = value; }
public static java.util.function.BiConsumer FURTHEST() { return net.minecraft.command.EntitySelectorReader.FURTHEST; }
// public static void FURTHEST(java.util.function.BiConsumer value, ) { net.minecraft.command.EntitySelectorReader.FURTHEST = value; }

// public char SELECTOR_PREFIX() { return wrapperContained.SELECTOR_PREFIX; }
// public void SELECTOR_PREFIX(char value) { wrapperContained.SELECTOR_PREFIX = value; }
public static char SELECTOR_PREFIX() { return net.minecraft.command.EntitySelectorReader.SELECTOR_PREFIX; }
// public static void SELECTOR_PREFIX(char value, ) { net.minecraft.command.EntitySelectorReader.SELECTOR_PREFIX = value; }

// public char ARGUMENT_DEFINER() { return wrapperContained.ARGUMENT_DEFINER; }
// public void ARGUMENT_DEFINER(char value) { wrapperContained.ARGUMENT_DEFINER = value; }
public static char ARGUMENT_DEFINER() { return net.minecraft.command.EntitySelectorReader.ARGUMENT_DEFINER; }
// public static void ARGUMENT_DEFINER(char value, ) { net.minecraft.command.EntitySelectorReader.ARGUMENT_DEFINER = value; }

// public char INVERT_MODIFIER() { return wrapperContained.INVERT_MODIFIER; }
// public void INVERT_MODIFIER(char value) { wrapperContained.INVERT_MODIFIER = value; }
public static char INVERT_MODIFIER() { return net.minecraft.command.EntitySelectorReader.INVERT_MODIFIER; }
// public static void INVERT_MODIFIER(char value, ) { net.minecraft.command.EntitySelectorReader.INVERT_MODIFIER = value; }

// public char TAG_MODIFIER() { return wrapperContained.TAG_MODIFIER; }
// public void TAG_MODIFIER(char value) { wrapperContained.TAG_MODIFIER = value; }
public static char TAG_MODIFIER() { return net.minecraft.command.EntitySelectorReader.TAG_MODIFIER; }
// public static void TAG_MODIFIER(char value, ) { net.minecraft.command.EntitySelectorReader.TAG_MODIFIER = value; }

// public char ARGUMENTS_OPENING() { return wrapperContained.ARGUMENTS_OPENING; }
// public void ARGUMENTS_OPENING(char value) { wrapperContained.ARGUMENTS_OPENING = value; }
// public static char ARGUMENTS_OPENING() { return net.minecraft.command.EntitySelectorReader.ARGUMENTS_OPENING; }
// public static void ARGUMENTS_OPENING(char value, ) { net.minecraft.command.EntitySelectorReader.ARGUMENTS_OPENING = value; }

// public char ARGUMENTS_CLOSING() { return wrapperContained.ARGUMENTS_CLOSING; }
// public void ARGUMENTS_CLOSING(char value) { wrapperContained.ARGUMENTS_CLOSING = value; }
// public static char ARGUMENTS_CLOSING() { return net.minecraft.command.EntitySelectorReader.ARGUMENTS_CLOSING; }
// public static void ARGUMENTS_CLOSING(char value, ) { net.minecraft.command.EntitySelectorReader.ARGUMENTS_CLOSING = value; }

// public char ARGUMENT_SEPARATOR() { return wrapperContained.ARGUMENT_SEPARATOR; }
// public void ARGUMENT_SEPARATOR(char value) { wrapperContained.ARGUMENT_SEPARATOR = value; }
// public static char ARGUMENT_SEPARATOR() { return net.minecraft.command.EntitySelectorReader.ARGUMENT_SEPARATOR; }
// public static void ARGUMENT_SEPARATOR(char value, ) { net.minecraft.command.EntitySelectorReader.ARGUMENT_SEPARATOR = value; }

// public char NEAREST_PLAYER() { return wrapperContained.NEAREST_PLAYER; }
// public void NEAREST_PLAYER(char value) { wrapperContained.NEAREST_PLAYER = value; }
// public static char NEAREST_PLAYER() { return net.minecraft.command.EntitySelectorReader.NEAREST_PLAYER; }
// public static void NEAREST_PLAYER(char value, ) { net.minecraft.command.EntitySelectorReader.NEAREST_PLAYER = value; }

// public char ALL_PLAYERS() { return wrapperContained.ALL_PLAYERS; }
// public void ALL_PLAYERS(char value) { wrapperContained.ALL_PLAYERS = value; }
// public static char ALL_PLAYERS() { return net.minecraft.command.EntitySelectorReader.ALL_PLAYERS; }
// public static void ALL_PLAYERS(char value, ) { net.minecraft.command.EntitySelectorReader.ALL_PLAYERS = value; }

// public char RANDOM_PLAYER() { return wrapperContained.RANDOM_PLAYER; }
// public void RANDOM_PLAYER(char value) { wrapperContained.RANDOM_PLAYER = value; }
// public static char RANDOM_PLAYER() { return net.minecraft.command.EntitySelectorReader.RANDOM_PLAYER; }
// public static void RANDOM_PLAYER(char value, ) { net.minecraft.command.EntitySelectorReader.RANDOM_PLAYER = value; }

// public char SELF() { return wrapperContained.SELF; }
// public void SELF(char value) { wrapperContained.SELF = value; }
// public static char SELF() { return net.minecraft.command.EntitySelectorReader.SELF; }
// public static void SELF(char value, ) { net.minecraft.command.EntitySelectorReader.SELF = value; }

// public char ALL_ENTITIES() { return wrapperContained.ALL_ENTITIES; }
// public void ALL_ENTITIES(char value) { wrapperContained.ALL_ENTITIES = value; }
// public static char ALL_ENTITIES() { return net.minecraft.command.EntitySelectorReader.ALL_ENTITIES; }
// public static void ALL_ENTITIES(char value, ) { net.minecraft.command.EntitySelectorReader.ALL_ENTITIES = value; }

// public char NEAREST_ENTITY() { return wrapperContained.NEAREST_ENTITY; }
// public void NEAREST_ENTITY(char value) { wrapperContained.NEAREST_ENTITY = value; }
// public static char NEAREST_ENTITY() { return net.minecraft.command.EntitySelectorReader.NEAREST_ENTITY; }
// public static void NEAREST_ENTITY(char value, ) { net.minecraft.command.EntitySelectorReader.NEAREST_ENTITY = value; }

public EntitySelectorReader(com.mojang.brigadier.StringReader reader,boolean atAllowed) { this.wrapperContained = new net.minecraft.command.EntitySelectorReader(reader,atAllowed); }
// public boolean excludesTeam() { return wrapperContained.excludesTeam(); }
// // public static boolean excludesTeam() { return net.minecraft.command.EntitySelectorReader.excludesTeam(); }
// public java.util.concurrent.CompletableFuture suggestDefinerNext(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestDefinerNext(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestDefinerNext(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestDefinerNext(builder,consumer); }
public java.util.function.BiConsumer getSorter() { return wrapperContained.getSorter(); }
// public static java.util.function.BiConsumer getSorter() { return net.minecraft.command.EntitySelectorReader.getSorter(); }
// public boolean shouldAllowAtSelectors(java.lang.Object source) { return wrapperContained.shouldAllowAtSelectors(source); }
// public static boolean shouldAllowAtSelectors(java.lang.Object source, ) { return net.minecraft.command.EntitySelectorReader.shouldAllowAtSelectors(source); }
public void setExcludesTeam(boolean excludesTeam) { wrapperContained.setExcludesTeam(excludesTeam); }
// public static void setExcludesTeam(boolean excludesTeam, ) { net.minecraft.command.EntitySelectorReader.setExcludesTeam(excludesTeam); }
// public java.util.concurrent.CompletableFuture suggestSelectorRest(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestSelectorRest(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestSelectorRest(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestSelectorRest(builder,consumer); }
public com.mojang.brigadier.StringReader getReader() { return wrapperContained.getReader(); }
// public static com.mojang.brigadier.StringReader getReader() { return net.minecraft.command.EntitySelectorReader.getReader(); }
// public boolean excludesGameMode() { return wrapperContained.excludesGameMode(); }
// // public static boolean excludesGameMode() { return net.minecraft.command.EntitySelectorReader.excludesGameMode(); }
// public boolean selectsGameMode() { return wrapperContained.selectsGameMode(); }
// // public static boolean selectsGameMode() { return net.minecraft.command.EntitySelectorReader.selectsGameMode(); }
public java.lang.Double getDy() { return wrapperContained.getDy(); }
// public static java.lang.Double getDy() { return net.minecraft.command.EntitySelectorReader.getDy(); }
public void setIncludesNonPlayers(boolean includesNonPlayers) { wrapperContained.setIncludesNonPlayers(includesNonPlayers); }
// public static void setIncludesNonPlayers(boolean includesNonPlayers, ) { net.minecraft.command.EntitySelectorReader.setIncludesNonPlayers(includesNonPlayers); }
public void setEntityType(yarnwrap.entity.EntityType entityType) { wrapperContained.setEntityType(entityType.wrapperContained); }
// public static void setEntityType(yarnwrap.entity.EntityType entityType, ) { net.minecraft.command.EntitySelectorReader.setEntityType(entityType.wrapperContained); }
// public boolean selectsScores() { return wrapperContained.selectsScores(); }
// // public static boolean selectsScores() { return net.minecraft.command.EntitySelectorReader.selectsScores(); }
// public boolean excludesName() { return wrapperContained.excludesName(); }
// // public static boolean excludesName() { return net.minecraft.command.EntitySelectorReader.excludesName(); }
public void setSorter(java.util.function.BiConsumer sorter) { wrapperContained.setSorter(sorter); }
// public static void setSorter(java.util.function.BiConsumer sorter, ) { net.minecraft.command.EntitySelectorReader.setSorter(sorter); }
// public void setLevelRange(Object levelRange) { wrapperContained.setLevelRange(levelRange); }
// public static void setLevelRange(Object levelRange, ) { net.minecraft.command.EntitySelectorReader.setLevelRange(levelRange); }
// public java.util.concurrent.CompletableFuture suggestEndNext(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestEndNext(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestEndNext(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestEndNext(builder,consumer); }
public void setSelectsScores(boolean selectsScores) { wrapperContained.setSelectsScores(selectsScores); }
// public static void setSelectsScores(boolean selectsScores, ) { net.minecraft.command.EntitySelectorReader.setSelectsScores(selectsScores); }
// public void readRegular() { wrapperContained.readRegular(); }
// public static void readRegular() { net.minecraft.command.EntitySelectorReader.readRegular(); }
public void setX(double x) { wrapperContained.setX(x); }
// public static void setX(double x, ) { net.minecraft.command.EntitySelectorReader.setX(x); }
public java.lang.Double getDx() { return wrapperContained.getDx(); }
// public static java.lang.Double getDx() { return net.minecraft.command.EntitySelectorReader.getDx(); }
public void setLocalWorldOnly() { wrapperContained.setLocalWorldOnly(); }
// public static void setLocalWorldOnly() { net.minecraft.command.EntitySelectorReader.setLocalWorldOnly(); }
public yarnwrap.command.FloatRangeArgument getYawRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.getYawRange()); }
// public static yarnwrap.command.FloatRangeArgument getYawRange() { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.EntitySelectorReader.getYawRange()); }
// public java.util.concurrent.CompletableFuture method_9854(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.method_9854(builder,consumer); }
// public static java.util.concurrent.CompletableFuture method_9854(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.method_9854(builder,consumer); }
public void setYawRange(yarnwrap.command.FloatRangeArgument yawRange) { wrapperContained.setYawRange(yawRange.wrapperContained); }
// public static void setYawRange(yarnwrap.command.FloatRangeArgument yawRange, ) { net.minecraft.command.EntitySelectorReader.setYawRange(yawRange.wrapperContained); }
// public boolean method_9856(yarnwrap.entity.Entity entity) { return wrapperContained.method_9856(entity.wrapperContained); }
// public static boolean method_9856(yarnwrap.entity.Entity entity, ) { return net.minecraft.command.EntitySelectorReader.method_9856(entity.wrapperContained); }
public void setExcludesGameMode(boolean excludesGameMode) { wrapperContained.setExcludesGameMode(excludesGameMode); }
// public static void setExcludesGameMode(boolean excludesGameMode, ) { net.minecraft.command.EntitySelectorReader.setExcludesGameMode(excludesGameMode); }
// public java.util.concurrent.CompletableFuture suggestNormal(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestNormal(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestNormal(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestNormal(builder,consumer); }
// public java.util.function.Predicate rotationPredicate(yarnwrap.command.FloatRangeArgument angleRange,java.util.function.ToDoubleFunction entityToAngle) { return wrapperContained.rotationPredicate(angleRange.wrapperContained,entityToAngle); }
// public static java.util.function.Predicate rotationPredicate(yarnwrap.command.FloatRangeArgument angleRange,java.util.function.ToDoubleFunction entityToAngle, ) { return net.minecraft.command.EntitySelectorReader.rotationPredicate(angleRange.wrapperContained,entityToAngle); }
public void setExcludesEntityType() { wrapperContained.setExcludesEntityType(); }
// public static void setExcludesEntityType() { net.minecraft.command.EntitySelectorReader.setExcludesEntityType(); }
// public boolean selectsAdvancements() { return wrapperContained.selectsAdvancements(); }
// // public static boolean selectsAdvancements() { return net.minecraft.command.EntitySelectorReader.selectsAdvancements(); }
// public int method_9862(yarnwrap.util.math.Vec3d entity1,yarnwrap.entity.Entity entity2) { return wrapperContained.method_9862(entity1.wrapperContained,entity2.wrapperContained); }
// public static int method_9862(yarnwrap.util.math.Vec3d entity1,yarnwrap.entity.Entity entity2, ) { return net.minecraft.command.EntitySelectorReader.method_9862(entity1.wrapperContained,entity2.wrapperContained); }
// public com.mojang.brigadier.Message method_9863(java.lang.Object selectorType) { return wrapperContained.method_9863(selectorType); }
// public static com.mojang.brigadier.Message method_9863(java.lang.Object selectorType, ) { return net.minecraft.command.EntitySelectorReader.method_9863(selectorType); }
public void setY(double y) { wrapperContained.setY(y); }
// public static void setY(double y, ) { net.minecraft.command.EntitySelectorReader.setY(y); }
public void setSelectsTeam(boolean selectsTeam) { wrapperContained.setSelectsTeam(selectsTeam); }
// public static void setSelectsTeam(boolean selectsTeam, ) { net.minecraft.command.EntitySelectorReader.setSelectsTeam(selectsTeam); }
// public boolean hasLimit() { return wrapperContained.hasLimit(); }
// // public static boolean hasLimit() { return net.minecraft.command.EntitySelectorReader.hasLimit(); }
// public void method_9867(yarnwrap.util.math.Vec3d pos,java.util.List entities) { wrapperContained.method_9867(pos.wrapperContained,entities); }
// public static void method_9867(yarnwrap.util.math.Vec3d pos,java.util.List entities, ) { net.minecraft.command.EntitySelectorReader.method_9867(pos.wrapperContained,entities); }
public java.lang.Double getZ() { return wrapperContained.getZ(); }
// public static java.lang.Double getZ() { return net.minecraft.command.EntitySelectorReader.getZ(); }
// public yarnwrap.util.math.Vec3d method_9869(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_9869(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d method_9869(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.command.EntitySelectorReader.method_9869(pos.wrapperContained)); }
// public void setDistance(Object distance) { wrapperContained.setDistance(distance); }
// public static void setDistance(Object distance, ) { net.minecraft.command.EntitySelectorReader.setDistance(distance); }
public yarnwrap.command.EntitySelector build() { return new yarnwrap.command.EntitySelector(wrapperContained.build()); }
// public static yarnwrap.command.EntitySelector build() { return new yarnwrap.command.EntitySelector(net.minecraft.command.EntitySelectorReader.build()); }
// public yarnwrap.util.math.Vec3d method_9872(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_9872(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d method_9872(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.command.EntitySelectorReader.method_9872(pos.wrapperContained)); }
public Object getDistance() { return wrapperContained.getDistance(); }
// public static Object getDistance() { return net.minecraft.command.EntitySelectorReader.getDistance(); }
// public void readArguments() { wrapperContained.readArguments(); }
// public static void readArguments() { net.minecraft.command.EntitySelectorReader.readArguments(); }
public void setSuggestionProvider(java.util.function.BiFunction suggestionProvider) { wrapperContained.setSuggestionProvider(suggestionProvider); }
// public static void setSuggestionProvider(java.util.function.BiFunction suggestionProvider, ) { net.minecraft.command.EntitySelectorReader.setSuggestionProvider(suggestionProvider); }
public void setHasLimit(boolean hasLimit) { wrapperContained.setHasLimit(hasLimit); }
// public static void setHasLimit(boolean hasLimit, ) { net.minecraft.command.EntitySelectorReader.setHasLimit(hasLimit); }
// public void buildPredicate() { wrapperContained.buildPredicate(); }
// public static void buildPredicate() { net.minecraft.command.EntitySelectorReader.buildPredicate(); }
public void setZ(double z) { wrapperContained.setZ(z); }
// public static void setZ(double z, ) { net.minecraft.command.EntitySelectorReader.setZ(z); }
// public java.util.concurrent.CompletableFuture suggestSelector(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestSelector(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestSelector(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestSelector(builder,consumer); }
// public boolean method_9881(java.util.function.ToDoubleFunction entity) { return wrapperContained.method_9881(entity); }
// public static boolean method_9881(java.util.function.ToDoubleFunction entity, ) { return net.minecraft.command.EntitySelectorReader.method_9881(entity); }
// public yarnwrap.command.EntitySelector read() { return new yarnwrap.command.EntitySelector(wrapperContained.read()); }
// public static yarnwrap.command.EntitySelector read() { return new yarnwrap.command.EntitySelector(net.minecraft.command.EntitySelectorReader.read()); }
public yarnwrap.command.FloatRangeArgument getPitchRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.getPitchRange()); }
// public static yarnwrap.command.FloatRangeArgument getPitchRange() { return new yarnwrap.command.FloatRangeArgument(net.minecraft.command.EntitySelectorReader.getPitchRange()); }
public java.lang.Double getY() { return wrapperContained.getY(); }
// public static java.lang.Double getY() { return net.minecraft.command.EntitySelectorReader.getY(); }
public boolean isSenderOnly() { return wrapperContained.isSenderOnly(); }
// public static boolean isSenderOnly() { return net.minecraft.command.EntitySelectorReader.isSenderOnly(); }
public boolean selectsEntityType() { return wrapperContained.selectsEntityType(); }
// public static boolean selectsEntityType() { return net.minecraft.command.EntitySelectorReader.selectsEntityType(); }
public void setHasSorter(boolean hasSorter) { wrapperContained.setHasSorter(hasSorter); }
// public static void setHasSorter(boolean hasSorter, ) { net.minecraft.command.EntitySelectorReader.setHasSorter(hasSorter); }
// public void method_9888(yarnwrap.util.math.Vec3d pos,java.util.List entities) { wrapperContained.method_9888(pos.wrapperContained,entities); }
// public static void method_9888(yarnwrap.util.math.Vec3d pos,java.util.List entities, ) { net.minecraft.command.EntitySelectorReader.method_9888(pos.wrapperContained,entities); }
// public boolean hasSorter() { return wrapperContained.hasSorter(); }
// // public static boolean hasSorter() { return net.minecraft.command.EntitySelectorReader.hasSorter(); }
public void setSelectsGameMode(boolean selectsGameMode) { wrapperContained.setSelectsGameMode(selectsGameMode); }
// public static void setSelectsGameMode(boolean selectsGameMode, ) { net.minecraft.command.EntitySelectorReader.setSelectsGameMode(selectsGameMode); }
public void setDx(double dx) { wrapperContained.setDx(dx); }
// public static void setDx(double dx, ) { net.minecraft.command.EntitySelectorReader.setDx(dx); }
public boolean readNegationCharacter() { return wrapperContained.readNegationCharacter(); }
// public static boolean readNegationCharacter() { return net.minecraft.command.EntitySelectorReader.readNegationCharacter(); }
// public java.util.concurrent.CompletableFuture suggestOpen(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestOpen(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestOpen(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestOpen(builder,consumer); }
// public yarnwrap.util.math.Box createBox(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.createBox(x,y,z)); }
// public static yarnwrap.util.math.Box createBox(double x,double y,double z, ) { return new yarnwrap.util.math.Box(net.minecraft.command.EntitySelectorReader.createBox(x,y,z)); }
public Object getLevelRange() { return wrapperContained.getLevelRange(); }
// public static Object getLevelRange() { return net.minecraft.command.EntitySelectorReader.getLevelRange(); }
// public void suggestSelector(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { wrapperContained.suggestSelector(builder); }
// public static void suggestSelector(com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { net.minecraft.command.EntitySelectorReader.suggestSelector(builder); }
// public int method_9897(yarnwrap.util.math.Vec3d entity1,yarnwrap.entity.Entity entity2) { return wrapperContained.method_9897(entity1.wrapperContained,entity2.wrapperContained); }
// public static int method_9897(yarnwrap.util.math.Vec3d entity1,yarnwrap.entity.Entity entity2, ) { return net.minecraft.command.EntitySelectorReader.method_9897(entity1.wrapperContained,entity2.wrapperContained); }
public void setPitchRange(yarnwrap.command.FloatRangeArgument pitchRange) { wrapperContained.setPitchRange(pitchRange.wrapperContained); }
// public static void setPitchRange(yarnwrap.command.FloatRangeArgument pitchRange, ) { net.minecraft.command.EntitySelectorReader.setPitchRange(pitchRange.wrapperContained); }
public void setSelectsName(boolean selectsName) { wrapperContained.setSelectsName(selectsName); }
// public static void setSelectsName(boolean selectsName, ) { net.minecraft.command.EntitySelectorReader.setSelectsName(selectsName); }
public void setLimit(int limit) { wrapperContained.setLimit(limit); }
// public static void setLimit(int limit, ) { net.minecraft.command.EntitySelectorReader.setLimit(limit); }
// public void method_9901(yarnwrap.util.math.Vec3d pos,java.util.List entities) { wrapperContained.method_9901(pos.wrapperContained,entities); }
// public static void method_9901(yarnwrap.util.math.Vec3d pos,java.util.List entities, ) { net.minecraft.command.EntitySelectorReader.method_9901(pos.wrapperContained,entities); }
public java.lang.Double getX() { return wrapperContained.getX(); }
// public static java.lang.Double getX() { return net.minecraft.command.EntitySelectorReader.getX(); }
// public com.mojang.brigadier.Message method_9903(java.lang.Object option) { return wrapperContained.method_9903(option); }
// public static com.mojang.brigadier.Message method_9903(java.lang.Object option, ) { return net.minecraft.command.EntitySelectorReader.method_9903(option); }
// public boolean selectsTeam() { return wrapperContained.selectsTeam(); }
// // public static boolean selectsTeam() { return net.minecraft.command.EntitySelectorReader.selectsTeam(); }
public void setDy(double dy) { wrapperContained.setDy(dy); }
// public static void setDy(double dy, ) { net.minecraft.command.EntitySelectorReader.setDy(dy); }
public void setSelectsAdvancements(boolean selectsAdvancements) { wrapperContained.setSelectsAdvancements(selectsAdvancements); }
// public static void setSelectsAdvancements(boolean selectsAdvancements, ) { net.minecraft.command.EntitySelectorReader.setSelectsAdvancements(selectsAdvancements); }
public java.lang.Double getDz() { return wrapperContained.getDz(); }
// public static java.lang.Double getDz() { return net.minecraft.command.EntitySelectorReader.getDz(); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.listSuggestions(builder,consumer); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.listSuggestions(builder,consumer); }
// public java.util.concurrent.CompletableFuture suggestOption(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestOption(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestOption(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestOption(builder,consumer); }
// public boolean excludesEntityType() { return wrapperContained.excludesEntityType(); }
// // public static boolean excludesEntityType() { return net.minecraft.command.EntitySelectorReader.excludesEntityType(); }
// public java.util.concurrent.CompletableFuture suggestOptionOrEnd(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestOptionOrEnd(builder,consumer); }
// public static java.util.concurrent.CompletableFuture suggestOptionOrEnd(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer, ) { return net.minecraft.command.EntitySelectorReader.suggestOptionOrEnd(builder,consumer); }
// public boolean selectsName() { return wrapperContained.selectsName(); }
// // public static boolean selectsName() { return net.minecraft.command.EntitySelectorReader.selectsName(); }
public void setExcludesName(boolean excludesName) { wrapperContained.setExcludesName(excludesName); }
// public static void setExcludesName(boolean excludesName, ) { net.minecraft.command.EntitySelectorReader.setExcludesName(excludesName); }
public boolean readTagCharacter() { return wrapperContained.readTagCharacter(); }
// public static boolean readTagCharacter() { return net.minecraft.command.EntitySelectorReader.readTagCharacter(); }
public void addPredicate(java.util.function.Predicate predicate) { wrapperContained.addPredicate(predicate); }
// public static void addPredicate(java.util.function.Predicate predicate, ) { net.minecraft.command.EntitySelectorReader.addPredicate(predicate); }
// public void readAtVariable() { wrapperContained.readAtVariable(); }
// public static void readAtVariable() { net.minecraft.command.EntitySelectorReader.readAtVariable(); }
public void setDz(double dz) { wrapperContained.setDz(dz); }
// public static void setDz(double dz, ) { net.minecraft.command.EntitySelectorReader.setDz(dz); }

}