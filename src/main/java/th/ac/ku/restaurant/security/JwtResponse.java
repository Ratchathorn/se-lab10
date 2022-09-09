package th.ac.ku.restaurant.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class JwtResponse {
    // ใช้เมื่อ format ของ json ไม่ตรงกับ spring boot
    @JsonProperty("access_token") // json
    private String accessToken; // spring boot

    @JsonProperty("expires_in")
    private int expiresIn;

    @JsonProperty("token_type")
    private String tokenType;
}
