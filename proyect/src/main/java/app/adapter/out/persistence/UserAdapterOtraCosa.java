package app.adapter.out;

import app.domain.model.User;
import app.domain.ports.UserPort;
import app.infrastructure.persistence.entities.UserEntity;
import app.infrastructure.persistence.mapper.UserMapper;
import app.infrastructure.persistence.repository.UserRepository;

public class UserAdapterOtraCosa implements UserPort {
    
    private UserRepository userRepository;

	@Override
	public User findByDocument(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUserName(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}
        
        @Override
        public User update(User user) throws Exception {
            UserEntity savedEntity = userRepository.save(UserMapper.toEntity(user));
            return UserMapper.toDomain(savedEntity);
        }

}

