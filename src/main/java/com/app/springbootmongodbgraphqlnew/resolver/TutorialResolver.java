package com.app.springbootmongodbgraphqlnew.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.springbootmongodbgraphqlnew.model.Author;
import com.app.springbootmongodbgraphqlnew.model.Tutorial;
import com.app.springbootmongodbgraphqlnew.repository.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
	@Autowired
	private AuthorRepository authorRepository;

	public TutorialResolver(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public Author getAuthor(Tutorial tutorial) {
		return authorRepository.findById(tutorial.getAuthorId()).orElseThrow(null);
	}
}