package apiTesting.utils;



import io.restassured.response.Response;

public class HelperClass {
        private static Response apiResponse;

        public static void setApiResponse(Response response) {
            apiResponse = response;
        }

        public static Response getApiResponse() {
            return apiResponse;
        }
    }