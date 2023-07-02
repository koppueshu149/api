@RestController
@RequestMapping("/api")
public class YourController {

    @GetMapping("/endpoint")
    public ResponseEntity<String> handleEndpoint() {
        // Business logic
        if (condition) {
            throw new YourException("Custom exception message");
        }
        // Other code
        return ResponseEntity.ok("Response from endpoint");
    }

    // Other endpoints and code

}
