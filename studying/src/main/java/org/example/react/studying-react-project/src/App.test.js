import { render, screen } from '@testing-library/react';
import UseStateExample from './examples/UseStateExample';

test('renders learn react link', () => {
  render(<UseStateExample />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
