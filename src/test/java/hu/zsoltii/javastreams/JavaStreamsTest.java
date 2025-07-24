package hu.zsoltii.javastreams;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
class JavaStreamsTest {

    private static final List<String> TEST_DATAS;

    static {
        log.info("Creating test data...");
        long start = System.currentTimeMillis();
        TEST_DATAS = new ArrayList<>();
        IntStream.range(0, 30000000).mapToObj(i -> "testData" + i).forEachOrdered(TEST_DATAS::add);
        long end = System.currentTimeMillis();
        log.info("Create test data time: {} ms", (end - start));
    }

    @Test
    void for_noFunctionCall(TestInfo testInfo) {
        log.info("Running for {}", testInfo.getDisplayName());

        long start = System.currentTimeMillis();

        final List<String> upperCaseList = new ArrayList<>();
        for (String testData : TEST_DATAS) {
            upperCaseList.add(testData.toUpperCase(java.util.Locale.ROOT) + "|" + testData.toLowerCase(java.util.Locale.ROOT));
        }
        long end = System.currentTimeMillis();

        Assertions.assertNotNull(upperCaseList);
        Assertions.assertEquals(TEST_DATAS.size(), upperCaseList.size());

        logSpeedResult(testInfo, end, start);
    }

    @Test
    void for_functionCall(TestInfo testInfo) {
        log.info("Running for {}", testInfo.getDisplayName());

        long start = System.currentTimeMillis();

        final List<String> upperCaseList = new ArrayList<>();
        for (String testData : TEST_DATAS) {
            upperCaseList.add(convert(testData));
        }
        long end = System.currentTimeMillis();

        Assertions.assertNotNull(upperCaseList);
        Assertions.assertEquals(TEST_DATAS.size(), upperCaseList.size());

        logSpeedResult(testInfo, end, start);
    }

    @Test
    void stream_noFunctionCall(TestInfo testInfo) {
        log.info("Running for {}", testInfo.getDisplayName());

        long start = System.currentTimeMillis();

        final List<String> upperCaseList = TEST_DATAS.stream()
                .map(testData -> testData.toUpperCase(java.util.Locale.ROOT) + "|" + testData.toLowerCase(java.util.Locale.ROOT))
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        Assertions.assertNotNull(upperCaseList);
        Assertions.assertEquals(TEST_DATAS.size(), upperCaseList.size());

        logSpeedResult(testInfo, end, start);
    }

    @Test
    void stream_functionCall(TestInfo testInfo) {
        log.info("Running for {}", testInfo.getDisplayName());

        long start = System.currentTimeMillis();

        final List<String> upperCaseList = TEST_DATAS.stream()
                .map(JavaStreamsTest::convert)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        Assertions.assertNotNull(upperCaseList);
        Assertions.assertEquals(TEST_DATAS.size(), upperCaseList.size());

        logSpeedResult(testInfo, end, start);
    }

    @Test
    void parallelStream_noFunctionCall(TestInfo testInfo) {
        log.info("Running for {}", testInfo.getDisplayName());

        long start = System.currentTimeMillis();

        final List<String> upperCaseList = TEST_DATAS.parallelStream()
                .map(testData -> testData.toUpperCase(java.util.Locale.ROOT) + "|" + testData.toLowerCase(java.util.Locale.ROOT))
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        Assertions.assertNotNull(upperCaseList);
        Assertions.assertEquals(TEST_DATAS.size(), upperCaseList.size());

        logSpeedResult(testInfo, end, start);
    }

    @Test
    void parallelStream_functionCall(TestInfo testInfo) {
        log.info("Running for {}", testInfo.getDisplayName());

        long start = System.currentTimeMillis();

        final List<String> upperCaseList = TEST_DATAS.parallelStream()
                .map(JavaStreamsTest::convert)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        Assertions.assertNotNull(upperCaseList);
        Assertions.assertEquals(TEST_DATAS.size(), upperCaseList.size());

        logSpeedResult(testInfo, end, start);
    }

    private static void logSpeedResult(TestInfo testInfo, long end, long start) {
        log.info("{} - Convert all line time: {} ms", testInfo.getDisplayName(), (end - start));
    }

    private static String convert(String testData) {
        return testData.toUpperCase(java.util.Locale.ROOT) + "|" + testData.toLowerCase(java.util.Locale.ROOT);
    }
}
