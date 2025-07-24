# Results of Java Streams Performance Tests

## Java 8 - Spring Boot 2.7.18

`[INFO] Running hu.zsoltii.javastreams.JavaStreamsTest
21:32:29.511 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Creating test data...
21:32:57.431 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Create test data time: 27918 ms
21:32:57.440 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_noFunctionCall(TestInfo)
21:33:35.574 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_noFunctionCall(TestInfo) - Convert all line time: 38132 ms
21:33:35.579 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_functionCall(TestInfo)
21:34:05.878 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_functionCall(TestInfo) - Convert all line time: 30299 ms
21:34:05.879 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_functionCall(TestInfo)
21:34:28.552 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_functionCall(TestInfo) - Convert all line time: 22673 ms
21:34:28.553 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_noFunctionCall(TestInfo)
21:34:51.320 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_noFunctionCall(TestInfo) - Convert all line time: 22767 ms
21:34:51.321 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_functionCall(TestInfo)
21:35:09.602 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_functionCall(TestInfo) - Convert all line time: 18281 ms
21:35:09.603 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_noFunctionCall(TestInfo)
21:35:11.995 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_noFunctionCall(TestInfo) - Convert all line time: 2391 ms
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 162.511 s - in hu.zsoltii.javastreams.JavaStreamsTest`

--------------------------------------------

## Java 11 - Spring Boot 2.7.18

`[INFO] Running hu.zsoltii.javastreams.JavaStreamsTest
21:31:09.260 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Creating test data...
21:31:23.446 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Create test data time: 14185 ms
21:31:23.455 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_noFunctionCall(TestInfo)
21:31:26.760 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_noFunctionCall(TestInfo) - Convert all line time: 3304 ms
21:31:26.765 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_functionCall(TestInfo)
21:31:29.919 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_functionCall(TestInfo) - Convert all line time: 3154 ms
21:31:29.920 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_functionCall(TestInfo)
21:31:32.869 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_functionCall(TestInfo) - Convert all line time: 2949 ms
21:31:32.870 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_noFunctionCall(TestInfo)
21:31:35.623 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_noFunctionCall(TestInfo) - Convert all line time: 2753 ms
21:31:35.625 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_functionCall(TestInfo)
21:31:36.677 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_functionCall(TestInfo) - Convert all line time: 1050 ms
21:31:36.678 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_noFunctionCall(TestInfo)
21:31:38.064 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_noFunctionCall(TestInfo) - Convert all line time: 1386 ms
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 28.843 s - in hu.zsoltii.javastreams.JavaStreamsTest`

--------------------------------------------

## Java 17 - Spring Boot 2.7.18

`[INFO] Running hu.zsoltii.javastreams.JavaStreamsTest
21:29:44.837 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Creating test data...
21:29:46.023 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Create test data time: 1185 ms
21:29:46.031 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_noFunctionCall(TestInfo)
21:29:48.898 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_noFunctionCall(TestInfo) - Convert all line time: 2866 ms
21:29:48.903 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_functionCall(TestInfo)
21:29:51.614 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_functionCall(TestInfo) - Convert all line time: 2711 ms
21:29:51.615 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_functionCall(TestInfo)
21:29:54.229 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_functionCall(TestInfo) - Convert all line time: 2614 ms
21:29:54.230 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_noFunctionCall(TestInfo)
21:29:56.841 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_noFunctionCall(TestInfo) - Convert all line time: 2611 ms
21:29:56.842 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_functionCall(TestInfo)
21:29:58.054 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_functionCall(TestInfo) - Convert all line time: 1212 ms
21:29:58.056 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_noFunctionCall(TestInfo)
21:29:59.207 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_noFunctionCall(TestInfo) - Convert all line time: 1151 ms
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.411 s - in hu.zsoltii.javastreams.JavaStreamsTest`

--------------------------------------------

## Java 21 - Spring Boot 2.7.18

`[INFO] Running hu.zsoltii.javastreams.JavaStreamsTest
21:27:22.477 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Creating test data...
21:27:23.673 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Create test data time: 1195 ms
21:27:23.681 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_noFunctionCall(TestInfo)
21:27:26.398 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_noFunctionCall(TestInfo) - Convert all line time: 2716 ms
21:27:26.403 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for for_functionCall(TestInfo)
21:27:29.289 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - for_functionCall(TestInfo) - Convert all line time: 2885 ms
21:27:29.290 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_functionCall(TestInfo)
21:27:31.651 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_functionCall(TestInfo) - Convert all line time: 2361 ms
21:27:31.652 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for stream_noFunctionCall(TestInfo)
21:27:34.134 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - stream_noFunctionCall(TestInfo) - Convert all line time: 2482 ms
21:27:34.135 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_functionCall(TestInfo)
21:27:35.471 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_functionCall(TestInfo) - Convert all line time: 1335 ms
21:27:35.472 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - Running for parallelStream_noFunctionCall(TestInfo)
21:27:36.787 [main] INFO hu.zsoltii.javastreams.JavaStreamsTest - parallelStream_noFunctionCall(TestInfo) - Convert all line time: 1315 ms
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.351 s - in hu.zsoltii.javastreams.JavaStreamsTest`

## JavaStreamsTest class summary (English)

The `JavaStreamsTest` class is a performance test suite for various Java Stream and loop operations. It generates a large list of test data (30 million strings) and measures the execution time of different methods for converting each string to upper and lower case, both with and without using a helper function, and using sequential and parallel streams. The tests log the time taken for each approach, allowing for performance comparison.

The performance was tested using Temurin JDK versions 8, 11, 17, and 21. For each JDK, the `pom.xml` was configured with the appropriate `maven.compiler.source` and `maven.compiler.target` values to match the JDK version.

> **Note:** All tests were executed on Ubuntu 24.04, using Maven 3.9.9, on an AMD Ryzen 9 5900X processor with 64GB RAM.

### Analysis of Results

The results, found in the README, show significant performance improvements with newer JDK versions:
- **Java 8**: The slowest, with the for-loop taking over 38 seconds and parallel streams about 2.4 seconds.
- **Java 11**: Much faster, with the for-loop around 3.3 seconds and parallel streams about 1.4 seconds.
- **Java 17 & 21**: Fastest, with the for-loop around 2.7–2.9 seconds and parallel streams about 1.1–1.3 seconds.
- Data creation time also improved drastically from Java 8 to newer versions.

#### Intra-JDK Comparison
- **Java 8**: The for-ciklus is much slower than stream and parallelStream. Parallel streams are significantly faster than both for and stream.
- **Java 11**: All methods are much faster than Java 8. The difference between for, stream, and parallelStream narrows, but parallelStream remains the fastest.
- **Java 17 & 21**: The performance gap between for, stream, and parallelStream is minimal. ParallelStream is still the fastest, but for and stream are very close in speed, showing that improvements in the JDK have optimized all approaches.

This demonstrates that upgrading the JDK can yield substantial performance benefits for stream and string operations, and that parallel streams consistently provide the best performance, especially in older JDKs.

---

## JavaStreamsTest osztály összefoglaló (magyarul)

A `JavaStreamsTest` osztály különböző Java Stream és ciklus műveletek teljesítményét méri. Létrehoz egy nagy tesztadat-listát (30 millió string), majd különböző módszerekkel (for-ciklus, stream, parallelStream, segédfüggvénnyel és anélkül) konvertálja a stringeket kis- és nagybetűssé, és méri az egyes megközelítések futási idejét.

A sebességtesztek Temurin JDK 8, 11, 17 és 21 verziókkal készültek. Minden JDK-hoz a `pom.xml`-ben a `maven.compiler.source` és `maven.compiler.target` értékek a megfelelő JDK verzióra lettek állítva.

> **Megjegyzés:** Minden teszt Ubuntu 24.04 alatt, Maven 3.9.9-cel, AMD Ryzen 9 5900X processzoron és 64GB memóriával lett futtatva.

### Eredmények elemzése

A README-ben található eredmények alapján:
- **Java 8**: A leglassabb, a for-ciklus több mint 38 másodperc, a parallel stream kb. 2,4 másodperc.
- **Java 11**: Jelentősen gyorsabb, a for-ciklus kb. 3,3 másodperc, a parallel stream kb. 1,4 másodperc.
- **Java 17 és 21**: A leggyorsabbak, a for-ciklus kb. 2,7–2,9 másodperc, a parallel stream kb. 1,1–1,3 másodperc.
- Az adatok létrehozásának ideje is jelentősen csökkent az újabb JDK-kban.

#### JDK-n belüli különbségek
- **Java 8**: A for-ciklus sokkal lassabb, mint a stream vagy a parallelStream. A parallelStream jelentősen gyorsabb mindkettőnél.
- **Java 11**: Minden módszer sokkal gyorsabb, mint Java 8-ban. A for, stream és parallelStream közötti különbség csökken, de a parallelStream továbbra is a leggyorsabb.
- **Java 17 és 21**: A for, stream és parallelStream közötti különbség minimális. A parallelStream még mindig a leggyorsabb, de a for és a stream is nagyon közel van egymáshoz, ami azt mutatja, hogy a JDK fejlesztései minden megközelítést optimalizáltak.

Ez azt mutatja, hogy a JDK frissítése jelentős teljesítménynövekedést eredményezhet a stream és string műveletekben, és hogy a parallelStream különösen a régebbi JDK-kban ad kiemelkedő teljesítményt.
