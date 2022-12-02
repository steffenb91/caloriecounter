package com.adventofcode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ElfTest {

	@Test
	public void shouldGetCurrentLoad() {
		Elf elf = new Elf(List.of(1, 4, 56));
		assertThat(elf.getCurrentLoad(), is(61));
	}
}
