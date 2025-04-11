package yarnwrap.util;
public class Util { public net.minecraft.util.Util wrapperContained; public Util(net.minecraft.util.Util wrapperContained) { this.wrapperContained = wrapperContained; }

public Object nanoTimeSupplier() { return wrapperContained.nanoTimeSupplier; }
// public void nanoTimeSupplier(Object value) { wrapperContained.nanoTimeSupplier = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.ExecutorService MAIN_WORKER_EXECUTOR() { return wrapperContained.MAIN_WORKER_EXECUTOR; }
// public void MAIN_WORKER_EXECUTOR(java.util.concurrent.ExecutorService value) { wrapperContained.MAIN_WORKER_EXECUTOR = value; }
// public java.util.concurrent.ExecutorService IO_WORKER_EXECUTOR() { return wrapperContained.IO_WORKER_EXECUTOR; }
// public void IO_WORKER_EXECUTOR(java.util.concurrent.ExecutorService value) { wrapperContained.IO_WORKER_EXECUTOR = value; }
public java.util.UUID NIL_UUID() { return wrapperContained.NIL_UUID; }
// public void NIL_UUID(java.util.UUID value) { wrapperContained.NIL_UUID = value; }
public java.nio.file.spi.FileSystemProvider JAR_FILE_SYSTEM_PROVIDER() { return wrapperContained.JAR_FILE_SYSTEM_PROVIDER; }
// public void JAR_FILE_SYSTEM_PROVIDER(java.nio.file.spi.FileSystemProvider value) { wrapperContained.JAR_FILE_SYSTEM_PROVIDER = value; }
// public int MAX_PARALLELISM() { return wrapperContained.MAX_PARALLELISM; }
// public void MAX_PARALLELISM(int value) { wrapperContained.MAX_PARALLELISM = value; }
// public java.lang.String MAX_BG_THREADS_PROPERTY() { return wrapperContained.MAX_BG_THREADS_PROPERTY; }
// public void MAX_BG_THREADS_PROPERTY(java.lang.String value) { wrapperContained.MAX_BG_THREADS_PROPERTY = value; }
// public java.util.function.Consumer missingBreakpointHandler() { return wrapperContained.missingBreakpointHandler; }
// public void missingBreakpointHandler(java.util.function.Consumer value) { wrapperContained.missingBreakpointHandler = value; }
public com.google.common.base.Ticker TICKER() { return wrapperContained.TICKER; }
// public void TICKER(com.google.common.base.Ticker value) { wrapperContained.TICKER = value; }
// public java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return wrapperContained.DATE_TIME_FORMATTER; }
// public void DATE_TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.DATE_TIME_FORMATTER = value; }
// public int BACKUP_ATTEMPTS() { return wrapperContained.BACKUP_ATTEMPTS; }
// public void BACKUP_ATTEMPTS(int value) { wrapperContained.BACKUP_ATTEMPTS = value; }
// public java.util.concurrent.ExecutorService DOWNLOAD_WORKER_EXECUTOR() { return wrapperContained.DOWNLOAD_WORKER_EXECUTOR; }
// public void DOWNLOAD_WORKER_EXECUTOR(java.util.concurrent.ExecutorService value) { wrapperContained.DOWNLOAD_WORKER_EXECUTOR = value; }
// public java.util.Set SUPPORTED_URI_PROTOCOLS() { return wrapperContained.SUPPORTED_URI_PROTOCOLS; }
// public void SUPPORTED_URI_PROTOCOLS(java.util.Set value) { wrapperContained.SUPPORTED_URI_PROTOCOLS = value; }
public java.util.Optional ifPresentOrElse(java.util.Optional optional,java.util.function.Consumer presentAction,java.lang.Runnable elseAction) { return wrapperContained.ifPresentOrElse(optional,presentAction,elseAction); }
// public void uncaughtExceptionHandler(java.lang.Thread thread,java.lang.Throwable t) { wrapperContained.uncaughtExceptionHandler(thread,t); }
public java.util.concurrent.ExecutorService getMainWorkerExecutor() { return wrapperContained.getMainWorkerExecutor(); }
public void shutdownExecutors() { wrapperContained.shutdownExecutors(); }
public java.lang.Runnable debugRunnable(java.lang.Runnable runnable,java.util.function.Supplier messageSupplier) { return wrapperContained.debugRunnable(runnable,messageSupplier); }
public java.lang.Object getLast(java.util.List list) { return wrapperContained.getLast(list); }
public java.lang.Throwable throwOrPause(java.lang.Throwable t) { return wrapperContained.throwOrPause(t); }
public java.lang.String getInnermostMessage(java.lang.Throwable t) { return wrapperContained.getInnermostMessage(t); }
public void throwUnchecked(java.lang.Throwable t) { wrapperContained.throwUnchecked(t); }
// public int getRandom(int array,net.minecraft.util.math.random.Random[] random) { return wrapperContained.getRandom(array,random); }
public java.lang.Object getRandom(java.lang.Object[] array,yarnwrap.util.math.random.Random random) { return wrapperContained.getRandom(array,random.wrapperContained); }
public int moveCursor(java.lang.String string,int cursor,int delta) { return wrapperContained.moveCursor(string,cursor,delta); }
// public java.lang.Thread method_27956(java.lang.String runnable) { return wrapperContained.method_27956(runnable); }
// public void attemptShutdown(java.util.concurrent.ExecutorService service) { wrapperContained.attemptShutdown(service); }
public java.util.concurrent.ExecutorService getIoWorkerExecutor() { return wrapperContained.getIoWorkerExecutor(); }
// public java.util.concurrent.ExecutorService createIoWorker(java.lang.String namePrefix,boolean daemon) { return wrapperContained.createIoWorker(namePrefix,daemon); }
// public java.util.concurrent.ExecutorService createWorker(java.lang.String name) { return wrapperContained.createWorker(name); }
// public java.util.concurrent.ForkJoinWorkerThread method_28123(java.lang.String pool) { return wrapperContained.method_28123(pool); }
// public com.mojang.datafixers.types.Type getChoiceType(Object typeReference,java.lang.String id) { return wrapperContained.getChoiceType(typeReference,id); }
public java.util.function.Consumer addPrefix(java.lang.String prefix,java.util.function.Consumer consumer) { return wrapperContained.addPrefix(prefix,consumer); }
// public void method_29189(java.util.function.Consumer string) { wrapperContained.method_29189(string); }
public com.mojang.serialization.DataResult decodeFixedLengthArray(java.util.stream.IntStream stream,int length) { return wrapperContained.decodeFixedLengthArray(stream,length); }
// public com.mojang.datafixers.types.Type getChoiceTypeInternal(Object typeReference,java.lang.String id) { return wrapperContained.getChoiceTypeInternal(typeReference,id); }
public void startTimerHack() { wrapperContained.startTimerHack(); }
// public void relativeCopy(java.nio.file.Path src,java.nio.file.Path dest,java.nio.file.Path toCopy) { wrapperContained.relativeCopy(src,dest,toCopy); }
public java.lang.String replaceInvalidChars(java.lang.String string,yarnwrap.util.function.CharPredicate predicate) { return wrapperContained.replaceInvalidChars(string,predicate.wrapperContained); }
// public boolean attemptTasks(int retries,java.lang.String taskName,java.util.function.BooleanSupplier[] tasks) { return wrapperContained.attemptTasks(retries,taskName,tasks); }
// public java.lang.String method_30623(yarnwrap.util.function.CharPredicate charCode) { return wrapperContained.method_30623(charCode.wrapperContained); }
// public java.util.function.BooleanSupplier deleteTask(java.nio.file.Path path) { return wrapperContained.deleteTask(path); }
// public java.util.function.BooleanSupplier renameTask(java.nio.file.Path src,java.nio.file.Path dest) { return wrapperContained.renameTask(src,dest); }
public void backupAndReplace(java.nio.file.Path current,java.nio.file.Path newPath,java.nio.file.Path backup) { wrapperContained.backupAndReplace(current,newPath,backup); }
// public boolean attemptTasks(java.util.function.BooleanSupplier[] tasks) { return wrapperContained.attemptTasks(tasks); }
// public java.util.function.BooleanSupplier deletionVerifyTask(java.nio.file.Path path) { return wrapperContained.deletionVerifyTask(path); }
// public java.util.function.BooleanSupplier existenceCheckTask(java.nio.file.Path path) { return wrapperContained.existenceCheckTask(path); }
public java.lang.Object getRandom(java.util.List list,yarnwrap.util.math.random.Random random) { return wrapperContained.getRandom(list,random.wrapperContained); }
public com.mojang.serialization.DataResult decodeFixedLengthList(java.util.List list,int length) { return wrapperContained.decodeFixedLengthList(list,length); }
public void error(java.lang.String message) { wrapperContained.error(message); }
// public void pause(java.lang.String message) { wrapperContained.pause(message); }
public java.lang.Runnable debugRunnable(java.lang.String activeThreadName,java.lang.Runnable task) { return wrapperContained.debugRunnable(activeThreadName,task); }
public java.util.concurrent.CompletableFuture combineSafe(java.util.List futures) { return wrapperContained.combineSafe(futures); }
public java.util.function.BiFunction memoize(java.util.function.BiFunction biFunction) { return wrapperContained.memoize(biFunction); }
public java.util.function.Function memoize(java.util.function.Function function) { return wrapperContained.memoize(function); }
// public boolean method_37153(java.nio.file.spi.FileSystemProvider fileSystemProvider) { return wrapperContained.method_37153(fileSystemProvider); }
public java.util.function.Supplier debugSupplier(java.lang.String activeThreadName,java.util.function.Supplier supplier) { return wrapperContained.debugSupplier(activeThreadName,supplier); }
public void setMissingBreakpointHandler(java.util.function.Consumer missingBreakpointHandler) { wrapperContained.setMissingBreakpointHandler(missingBreakpointHandler); }
// public void method_38647(java.lang.String message) { wrapperContained.method_38647(message); }
// public int getMaxBackgroundThreads() { return wrapperContained.getMaxBackgroundThreads(); }
public void error(java.lang.String message,java.lang.Throwable throwable) { wrapperContained.error(message,throwable); }
// public java.util.List method_40082(java.util.List void_) { return wrapperContained.method_40082(void_); }
public java.util.Optional getRandomOrEmpty(java.util.List list,yarnwrap.util.math.random.Random random) { return wrapperContained.getRandomOrEmpty(list,random.wrapperContained); }
public boolean backupAndReplace(java.nio.file.Path current,java.nio.file.Path newPath,java.nio.file.Path backup,boolean noRestoreOnFail) { return wrapperContained.backupAndReplace(current,newPath,backup,noRestoreOnFail); }
public java.util.function.Supplier debugSupplier(java.util.function.Supplier supplier,java.util.function.Supplier messageSupplier) { return wrapperContained.debugSupplier(supplier,messageSupplier); }
public java.util.List copyShuffled(it.unimi.dsi.fastutil.objects.ObjectArrayList list,yarnwrap.util.math.random.Random random) { return wrapperContained.copyShuffled(list,random.wrapperContained); }
public void shuffle(java.util.List list,yarnwrap.util.math.random.Random random) { wrapperContained.shuffle(list,random.wrapperContained); }
public it.unimi.dsi.fastutil.ints.IntArrayList shuffle(java.util.stream.IntStream stream,yarnwrap.util.math.random.Random random) { return wrapperContained.shuffle(stream,random.wrapperContained); }
public java.util.List copyShuffled(java.util.stream.Stream stream,yarnwrap.util.math.random.Random random) { return wrapperContained.copyShuffled(stream,random.wrapperContained); }
public java.util.List copyShuffled(java.lang.Object[] array,yarnwrap.util.math.random.Random random) { return wrapperContained.copyShuffled(array,random.wrapperContained); }
// public java.util.List method_43368(java.util.List void_) { return wrapperContained.method_43368(void_); }
// public void method_43369(java.util.concurrent.CompletableFuture throwable) { wrapperContained.method_43369(throwable); }
// public java.util.concurrent.CompletableFuture combine(java.util.List futures,java.util.function.Consumer exceptionHandler) { return wrapperContained.combine(futures,exceptionHandler); }
// public void method_43371(java.util.List future) { wrapperContained.method_43371(future); }
// public void method_43372(java.util.function.Consumer value,java.util.List throwable) { wrapperContained.method_43372(value,throwable); }
public java.util.concurrent.CompletableFuture combineCancellable(java.util.List futures) { return wrapperContained.combineCancellable(futures); }
public java.lang.Object waitAndApply(java.util.function.Function resultFactory,java.util.function.Predicate donePredicate) { return wrapperContained.waitAndApply(resultFactory,donePredicate); }
public java.util.concurrent.CompletableFuture waitAndApply(java.util.function.Function resultFactory) { return wrapperContained.waitAndApply(resultFactory); }
public java.util.function.ToIntFunction lastIndexGetter(java.util.List values) { return wrapperContained.lastIndexGetter(values); }
public java.lang.String getFormattedCurrentTime() { return wrapperContained.getFormattedCurrentTime(); }
public yarnwrap.util.CachedMapper cachedMapper(java.util.function.Function mapper) { return new yarnwrap.util.CachedMapper(wrapperContained.cachedMapper(mapper)); }
public com.mojang.serialization.DataResult decodeFixedLengthArray(java.util.stream.LongStream stream,int length) { return wrapperContained.decodeFixedLengthArray(stream,length); }
public java.util.function.ToIntFunction lastIdentityIndexGetter(java.util.List values) { return wrapperContained.lastIdentityIndexGetter(values); }
public com.mojang.datafixers.Typed apply(com.mojang.datafixers.Typed typed,com.mojang.datafixers.types.Type type,java.util.function.UnaryOperator modifier) { return wrapperContained.apply(typed,type,modifier); }
public com.mojang.datafixers.Typed readTyped(com.mojang.datafixers.types.Type type,com.mojang.serialization.Dynamic value) { return wrapperContained.readTyped(type,value); }
public com.mojang.datafixers.Typed readTyped(com.mojang.datafixers.types.Type type,com.mojang.serialization.Dynamic value,boolean allowPartial) { return wrapperContained.readTyped(type,value,allowPartial); }
public java.util.concurrent.ExecutorService getDownloadWorkerExecutor() { return wrapperContained.getDownloadWorkerExecutor(); }
public java.util.function.Predicate allOf(java.util.List predicates) { return wrapperContained.allOf(predicates); }
public java.util.function.Predicate anyOf(java.util.List predicates) { return wrapperContained.anyOf(predicates); }
public java.lang.String registryValueToString(yarnwrap.registry.Registry registry,java.lang.Object value) { return wrapperContained.registryValueToString(registry.wrapperContained,value); }
public java.util.List withAppended(java.util.List list,java.lang.Object valueToAppend) { return wrapperContained.withAppended(list,valueToAppend); }
public java.util.Map mapWith(java.util.Map map,java.lang.Object keyToAppend,java.lang.Object valueToAppend) { return wrapperContained.mapWith(map,keyToAppend,valueToAppend); }
public java.util.List withPrepended(java.lang.Object valueToPrepend,java.util.List list) { return wrapperContained.withPrepended(valueToPrepend,list); }
public java.util.stream.Collector toArrayList() { return wrapperContained.toArrayList(); }
public boolean isSymmetrical(int width,int height,java.util.List list) { return wrapperContained.isSymmetrical(width,height,list); }
// public java.net.URI validateUri(java.lang.String uri) { return wrapperContained.validateUri(uri); }
public java.lang.Object previous(java.lang.Iterable iterable,java.lang.Object object) { return wrapperContained.previous(iterable,object); }
public java.lang.String createTranslationKey(java.lang.String type,yarnwrap.util.Identifier id) { return wrapperContained.createTranslationKey(type,id.wrapperContained); }
public long getMeasuringTimeNano() { return wrapperContained.getMeasuringTimeNano(); }
public java.lang.String getValueAsString(yarnwrap.state.property.Property property,java.lang.Object value) { return wrapperContained.getValueAsString(property.wrapperContained,value); }
public java.util.stream.Stream getJVMFlags() { return wrapperContained.getJVMFlags(); }
public java.util.concurrent.CompletableFuture combine(java.util.List futures) { return wrapperContained.combine(futures); }
public java.lang.Object make(java.lang.Object object,java.util.function.Consumer initializer) { return wrapperContained.make(object,initializer); }
public java.lang.Object make(java.util.function.Supplier factory) { return wrapperContained.make(factory); }
public long getMeasuringTimeMs() { return wrapperContained.getMeasuringTimeMs(); }
public long getEpochTimeMs() { return wrapperContained.getEpochTimeMs(); }
public java.lang.Object next(java.lang.Iterable iterable,java.lang.Object object) { return wrapperContained.next(iterable,object); }
public java.util.stream.Collector toMap() { return wrapperContained.toMap(); }
// public boolean method_666(java.lang.String runtimeArg) { return wrapperContained.method_666(runtimeArg); }
public Object getOperatingSystem() { return wrapperContained.getOperatingSystem(); }

}