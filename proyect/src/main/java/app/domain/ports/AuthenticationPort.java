package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.auth.AuthCredentials;
import src.main.java.app.domain.model.auth.TokenResponseDto;

public interface AuthenticationPort {
    TokenResponseDto authenticate(AuthCredentials credentials, String role);
    boolean validateToken(String token);
    String extractUsername(String token);
    String extractRole(String token);
}